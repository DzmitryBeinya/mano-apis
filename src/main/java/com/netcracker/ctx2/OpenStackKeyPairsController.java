package com.netcracker.ctx2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenStackKeyPairsController {

    @GetMapping(value = "/v2.1/os-keypairs", produces = "application/json")
    public String getOsKeyPairs() {
        return "{\n" +
                "    \"flavors\": [\n" +
                "        {\n" +
                "            \"id\": \"33dec71e-b3ff-4025-9ac8-a887a32e0cc5\",\n" +
                "            \"links\": [\n" +
                "                {\n" +
                "                    \"href\": \"http://10.189.210.97:8774/v2.1/flavors/33dec71e-b3ff-4025-9ac8-a887a32e0cc5\",\n" +
                "                    \"rel\": \"self\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"href\": \"http://10.189.210.97:8774/flavors/33dec71e-b3ff-4025-9ac8-a887a32e0cc5\",\n" +
                "                    \"rel\": \"bookmark\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"name\": \"m1.large\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"3d5a0c23-6d93-4d93-8dad-34f868db61b7\",\n" +
                "            \"links\": [\n" +
                "                {\n" +
                "                    \"href\": \"http://10.189.210.97:8774/v2.1/flavors/3d5a0c23-6d93-4d93-8dad-34f868db61b7\",\n" +
                "                    \"rel\": \"self\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"href\": \"http://10.189.210.97:8774/flavors/3d5a0c23-6d93-4d93-8dad-34f868db61b7\",\n" +
                "                    \"rel\": \"bookmark\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"name\": \"m1.medium\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"5b72e8c9-b7b4-4dd1-b0d3-750f5de4bfdc\",\n" +
                "            \"links\": [\n" +
                "                {\n" +
                "                    \"href\": \"http://10.189.210.97:8774/v2.1/flavors/5b72e8c9-b7b4-4dd1-b0d3-750f5de4bfdc\",\n" +
                "                    \"rel\": \"self\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"href\": \"http://10.189.210.97:8774/flavors/5b72e8c9-b7b4-4dd1-b0d3-750f5de4bfdc\",\n" +
                "                    \"rel\": \"bookmark\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"name\": \"alpa_flavor\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"bd6cfe4f-3a50-41ac-a86c-ad2757501d17\",\n" +
                "            \"links\": [\n" +
                "                {\n" +
                "                    \"href\": \"http://10.189.210.97:8774/v2.1/flavors/bd6cfe4f-3a50-41ac-a86c-ad2757501d17\",\n" +
                "                    \"rel\": \"self\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"href\": \"http://10.189.210.97:8774/flavors/bd6cfe4f-3a50-41ac-a86c-ad2757501d17\",\n" +
                "                    \"rel\": \"bookmark\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"name\": \"c1.xxlarge\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"c7dbb7ba-5ed3-4fba-bc3f-702cacb41fa7\",\n" +
                "            \"links\": [\n" +
                "                {\n" +
                "                    \"href\": \"http://10.189.210.97:8774/v2.1/flavors/c7dbb7ba-5ed3-4fba-bc3f-702cacb41fa7\",\n" +
                "                    \"rel\": \"self\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"href\": \"http://10.189.210.97:8774/flavors/c7dbb7ba-5ed3-4fba-bc3f-702cacb41fa7\",\n" +
                "                    \"rel\": \"bookmark\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"name\": \"c1.xlarge\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"ca06bb92-fe61-423b-9617-0e2c7542a56b\",\n" +
                "            \"links\": [\n" +
                "                {\n" +
                "                    \"href\": \"http://10.189.210.97:8774/v2.1/flavors/ca06bb92-fe61-423b-9617-0e2c7542a56b\",\n" +
                "                    \"rel\": \"self\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"href\": \"http://10.189.210.97:8774/flavors/ca06bb92-fe61-423b-9617-0e2c7542a56b\",\n" +
                "                    \"rel\": \"bookmark\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"name\": \"m1.tiny\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"cdc62add-d9b1-45c6-b939-01aa352f3daa\",\n" +
                "            \"links\": [\n" +
                "                {\n" +
                "                    \"href\": \"http://10.189.210.97:8774/v2.1/flavors/cdc62add-d9b1-45c6-b939-01aa352f3daa\",\n" +
                "                    \"rel\": \"self\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"href\": \"http://10.189.210.97:8774/flavors/cdc62add-d9b1-45c6-b939-01aa352f3daa\",\n" +
                "                    \"rel\": \"bookmark\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"name\": \"d1.xxlarge\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"ec96dd5c-4cf1-4167-8ecb-61b9642d7fdb\",\n" +
                "            \"links\": [\n" +
                "                {\n" +
                "                    \"href\": \"http://10.189.210.97:8774/v2.1/flavors/ec96dd5c-4cf1-4167-8ecb-61b9642d7fdb\",\n" +
                "                    \"rel\": \"self\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"href\": \"http://10.189.210.97:8774/flavors/ec96dd5c-4cf1-4167-8ecb-61b9642d7fdb\",\n" +
                "                    \"rel\": \"bookmark\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"name\": \"alpa_flavor_2\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"ef6a0efc-1329-46d8-a6b5-348c7a263a93\",\n" +
                "            \"links\": [\n" +
                "                {\n" +
                "                    \"href\": \"http://10.189.210.97:8774/v2.1/flavors/ef6a0efc-1329-46d8-a6b5-348c7a263a93\",\n" +
                "                    \"rel\": \"self\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"href\": \"http://10.189.210.97:8774/flavors/ef6a0efc-1329-46d8-a6b5-348c7a263a93\",\n" +
                "                    \"rel\": \"bookmark\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"name\": \"m1.small\"\n" +
                "        },\n" +
                "\t\t{\n" +
                "            \"id\": \"Normal_E9K\",\n" +
                "            \"links\": [\n" +
                "                {\n" +
                "                    \"href\": \"http://10.189.210.97:8774/v2.1/flavors/Normal_E9K\",\n" +
                "                    \"rel\": \"self\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"href\": \"http://10.189.210.97:8774/flavors/Normal_E9K\",\n" +
                "                    \"rel\": \"bookmark\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"name\": \"Normal_E9K\"\n" +
                "        }\n" +
                "    ]\n" +
                "}";
    }
}
