package com.azure.maps.traffic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;

import com.azure.core.http.HttpClient;

public class TrafficClientTest extends TrafficClientTestBase {
    private TrafficClient client;
    private static final String DISPLAY_NAME_WITH_ARGUMENTS = "{displayName} with [{arguments}]";

    private TrafficClient getTrafficClient(HttpClient httpClient, TrafficServiceVersion serviceVersion) {
        return getTrafficAsyncClientBuilder(httpClient, serviceVersion).buildClient();
    }

    // Test get map tile
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.render.TestUtils#getTestParameters")
    public void testGetMapTile(HttpClient httpClient, TrafficServiceVersion serviceVersion) throws IOException {
        client = getTrafficClient(httpClient, serviceVersion);
        // MapTileOptions mapTileOptions = new MapTileOptions();
        // mapTileOptions.setTilesetId(TilesetID.MICROSOFT_BASE_ROAD);
        // mapTileOptions.setTileIndex(new TileIndex().setX(10).setY(22).setZ(6));
        // InputStream is = client.getMapTile(mapTileOptions);
        // File file = new File("maptilesampleoutput.txt");
        // Files.copy(is, file.toPath(), StandardCopyOption.REPLACE_EXISTING);
        // byte[] actualResult = Files.readAllBytes(file.toPath());
        // byte[] expectedResult = TestUtils.getExpectedMapTile();
        // validateGetMapTile(actualResult, expectedResult);
    }
}