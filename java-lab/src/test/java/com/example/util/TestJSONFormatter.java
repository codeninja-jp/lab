// import org.junit.jupiter.api.Test;

// import java.nio.charset.StandardCharsets;
// import java.nio.file.Files;
// import java.nio.file.Paths;

// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertTrue;
// import static org.junit.jupiter.api.Assertions.fail;

// public class MyJsonReaderTest {
//     @Test
//     public void testMain() {
//         try {
//             // Create a temporary JSON file with test data
//             String testData = "{\"name\": \"John Smith\", \"age\": 30}";
//             Files.write(Paths.get("test.json"), testData.getBytes(StandardCharsets.UTF_8));

//             // Run the main() method and capture the output
//             String expectedOutput = testData + "\n";
//             String actualOutput = TestUtils.runMain(MyJsonReader.class, "test.json");

//             // Verify that the output matches the expected result
//             assertEquals(expectedOutput, actualOutput, "Output should match expected result");

//             // Clean up the temporary file
//             Files.delete(Paths.get("test.json"));
//         } catch (Exception e) {
//             fail("Exception thrown: " + e.getMessage());
//         }
//     }
// }
