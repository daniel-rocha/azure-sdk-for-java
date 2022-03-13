package com.azure.maps.traffic;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.azure.core.test.TestBase;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.core.util.serializer.TypeReference;
import com.azure.maps.traffic.models.TrafficFlowSegmentData;
import com.azure.maps.traffic.implementation.models.TrafficIncidentDetail;
import com.azure.maps.traffic.implementation.models.TrafficIncidentViewport;

import org.junit.jupiter.params.provider.Arguments;

public class TestUtils {
    static final String FAKE_API_KEY = "1234567890";
    public static final Duration DEFAULT_POLL_INTERVAL = Duration.ofSeconds(30);

    // static byte[] getExpectedTrafficFlowTile() throws IOException {
    //     InputStream is = ClassLoader.getSystemResourceAsStream("trafficflowtile.png");
    //     File file = new File("trafficflowtileexpectedoutput.png");
    //     Files.copy(is, file.toPath(), StandardCopyOption.REPLACE_EXISTING);
    //     return Files.readAllBytes(file.toPath());
    // }

    static TrafficFlowSegmentData getExpectedTrafficFlowSegment() throws IOException {
        InputStream is = ClassLoader.getSystemResourceAsStream("trafficflowsegment.json");
        File file = new File("trafficflowsegmentexpectedoutput.txt");
        Files.copy(is, file.toPath(), StandardCopyOption.REPLACE_EXISTING);
        byte[] data = null;
        data = Files.readAllBytes(file.toPath());
        SerializerAdapter jacksonAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        TypeReference<TrafficFlowSegmentData> interimType = new TypeReference<TrafficFlowSegmentData>(){};
        return jacksonAdapter.<TrafficFlowSegmentData>deserialize(data, interimType.getJavaType(),
        SerializerEncoding.JSON);
    }

    static TrafficIncidentDetail getExpectedTrafficIncidentDetail() throws IOException {
        InputStream is = ClassLoader.getSystemResourceAsStream("trafficincidentdetail.json");
        File file = new File("trafficincidentdetailexpectedoutput.txt");
        Files.copy(is, file.toPath(), StandardCopyOption.REPLACE_EXISTING);
        byte[] data = null;
        data = Files.readAllBytes(file.toPath());
        SerializerAdapter jacksonAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        TypeReference<TrafficIncidentDetail> interimType = new TypeReference<TrafficIncidentDetail>(){};
        return jacksonAdapter.<TrafficIncidentDetail>deserialize(data, interimType.getJavaType(),
        SerializerEncoding.JSON);
    }

    static TrafficIncidentViewport getExpectedTrafficIncidentViewport() throws IOException {
        InputStream is = ClassLoader.getSystemResourceAsStream("trafficincidentviewport.json");
        File file = new File("trafficincidentviewportexpectedoutput.txt");
        Files.copy(is, file.toPath(), StandardCopyOption.REPLACE_EXISTING);
        byte[] data = null;
        data = Files.readAllBytes(file.toPath());
        SerializerAdapter jacksonAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        TypeReference<TrafficIncidentViewport> interimType = new TypeReference<TrafficIncidentViewport>(){};
        return jacksonAdapter.<TrafficIncidentViewport>deserialize(data, interimType.getJavaType(),
        SerializerEncoding.JSON);
    }

    /**
     * Returns a stream of arguments that includes all combinations of eligible {@link HttpClient HttpClients} and
     * service versions that should be tested.
     *
     * @return A stream of HttpClient and service version combinations to test.
     */
    public static Stream<Arguments> getTestParameters() {
        // when this issues is closed, the newer version of junit will have better support for
        // cartesian product of arguments - https://github.com/junit-team/junit5/issues/1427
        List<Arguments> argumentsList = new ArrayList<>();
        TestBase.getHttpClients()
            .forEach(httpClient -> {
                Arrays.stream(TrafficServiceVersion.values())
                    .forEach(serviceVersion -> argumentsList.add(Arguments.of(httpClient, serviceVersion)));
            });
        return argumentsList.stream();
    }
}