# Use a minimal base image
FROM golang:1.19-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the necessary files to the working directory
COPY go.mod .
COPY go.sum .
RUN go mod tidy

# Copy the application source code to the working directory
COPY . .

# Build the application
RUN go build -o main .

# Expose the port that the application will listen on
EXPOSE 8080

# Run the application
CMD ["./main"]
