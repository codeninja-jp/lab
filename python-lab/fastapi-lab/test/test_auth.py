from fastapi.testclient import TestClient
from main import app, fake_users_db

client = TestClient(app)

def test_login_success():
    username = "johndoe"
    password = "secret"
    response = client.post("/token", data={"username": username, "password": password})
    assert response.status_code == 200
    assert "access_token" in response.json()

def test_login_fail():
    username = "unknown_user"
    password = "incorrect_password"
    response = client.post("/token", data={"username": username, "password": password})
    assert response.status_code == 400
    assert "access_token" not in response.json()

def test_me_success():
    username = "johndoe"
    password = "secret"
    response = client.post("/token", data={"username": username, "password": password})
    access_token = response.json()["access_token"]
    response = client.get("/users/me", headers={"Authorization": f"Bearer {access_token}"})
    assert response.status_code == 200
    assert response.json()["username"] == username

def test_me_fail():
    username = "alice"
    password = "secret"
    response = client.post("/token", data={"username": username, "password": password})
    access_token = response.json()["access_token"]
    response = client.get("/users/me", headers={"Authorization": f"Bearer {access_token}"})
    assert response.status_code == 400
