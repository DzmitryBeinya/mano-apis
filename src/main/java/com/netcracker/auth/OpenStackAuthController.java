package com.netcracker.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/v3/auth/tokens")
public class OpenStackAuthController {

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String getTokens() {

        return "{\n" +
                "    \"token\": {\n" +
                "        \"is_domain\": false,\n" +
                "        \"methods\": [\n" +
                "            \"password\"\n" +
                "        ],\n" +
                "        \"roles\": [\n" +
                "            {\n" +
                "                \"id\": \"9fe2ff9ee4384b1894a90878d3e92bab\",\n" +
                "                \"name\": \"_member_\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"5b9e13f8864449f9ba3d843619050d8b\",\n" +
                "                \"name\": \"user\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"expires_at\": \"2018-09-14T02:13:27.000000Z\",\n" +
                "        \"project\": {\n" +
                "            \"domain\": {\n" +
                "                \"id\": \"default\",\n" +
                "                \"name\": \"Default\"\n" +
                "            },\n" +
                "            \"id\": \"a2346861d18a485f87d31f3db081f690\",\n" +
                "            \"name\": \"0\"\n" +
                "        },\n" +
                "        \"catalog\": [\n" +
                "            {\n" +
                "                \"endpoints\": [\n" +
                "                    {\n" +
                "                        \"url\": \"http://10.189.210.97:8776/v2/a2346861d18a485f87d31f3db081f690\",\n" +
                "                        \"interface\": \"internal\",\n" +
                "                        \"region\": \"RegionOne\",\n" +
                "                        \"region_id\": \"RegionOne\",\n" +
                "                        \"id\": \"646f1a82a69d4810814e6d9b13dfc8a5\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"url\": \"http://10.189.210.97:8776/v2/a2346861d18a485f87d31f3db081f690\",\n" +
                "                        \"interface\": \"admin\",\n" +
                "                        \"region\": \"RegionOne\",\n" +
                "                        \"region_id\": \"RegionOne\",\n" +
                "                        \"id\": \"9a1e1a29234748bfb852939738051789\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"url\": \"http://10.189.210.97:8776/v2/a2346861d18a485f87d31f3db081f690\",\n" +
                "                        \"interface\": \"public\",\n" +
                "                        \"region\": \"RegionOne\",\n" +
                "                        \"region_id\": \"RegionOne\",\n" +
                "                        \"id\": \"af34cad702694086a300a93d5a9e8f70\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"type\": \"volumev2\",\n" +
                "                \"id\": \"078e39100b274c0fa614aea122d29948\",\n" +
                "                \"name\": \"cinderv2\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"endpoints\": [\n" +
                "                    {\n" +
                "                        \"url\": \"http://10.189.210.97:8042\",\n" +
                "                        \"interface\": \"public\",\n" +
                "                        \"region\": \"RegionOne\",\n" +
                "                        \"region_id\": \"RegionOne\",\n" +
                "                        \"id\": \"1b3dc5a0ab0d4398be6671a4dcd1146b\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"url\": \"http://10.189.210.97:8042\",\n" +
                "                        \"interface\": \"internal\",\n" +
                "                        \"region\": \"RegionOne\",\n" +
                "                        \"region_id\": \"RegionOne\",\n" +
                "                        \"id\": \"5794f3b9df454d8f9a93e34a5b1d7346\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"url\": \"http://10.189.210.97:8042\",\n" +
                "                        \"interface\": \"admin\",\n" +
                "                        \"region\": \"RegionOne\",\n" +
                "                        \"region_id\": \"RegionOne\",\n" +
                "                        \"id\": \"9641850a4c904fb1bd5204b95aafe6fc\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"type\": \"alarming\",\n" +
                "                \"id\": \"0ec0a1ce2ccb491b8c846ba90ff4cbcd\",\n" +
                "                \"name\": \"aodh\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"endpoints\": [\n" +
                "                    {\n" +
                "                        \"url\": \"http://10.189.210.97:8000/v1/a2346861d18a485f87d31f3db081f690\",\n" +
                "                        \"interface\": \"public\",\n" +
                "                        \"region\": \"RegionOne\",\n" +
                "                        \"region_id\": \"RegionOne\",\n" +
                "                        \"id\": \"400e038ac0c347b2a6f5dca069d553f2\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"url\": \"http://10.189.210.97:8000/v1/a2346861d18a485f87d31f3db081f690\",\n" +
                "                        \"interface\": \"internal\",\n" +
                "                        \"region\": \"RegionOne\",\n" +
                "                        \"region_id\": \"RegionOne\",\n" +
                "                        \"id\": \"762335a2bd354d27aa98e33ccccc0a43\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"url\": \"http://10.189.210.97:8000/v1/a2346861d18a485f87d31f3db081f690\",\n" +
                "                        \"interface\": \"admin\",\n" +
                "                        \"region\": \"RegionOne\",\n" +
                "                        \"region_id\": \"RegionOne\",\n" +
                "                        \"id\": \"d45ca48fe78e40ec9163a4d751da47a9\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"type\": \"cloudformation\",\n" +
                "                \"id\": \"22236246419848e186801e5750f4dbbd\",\n" +
                "                \"name\": \"heat-cfn\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"endpoints\": [\n" +
                "                    {\n" +
                "                        \"url\": \"http://10.189.210.97:8004/v1/a2346861d18a485f87d31f3db081f690\",\n" +
                "                        \"interface\": \"internal\",\n" +
                "                        \"region\": \"RegionOne\",\n" +
                "                        \"region_id\": \"RegionOne\",\n" +
                "                        \"id\": \"0ef079171e2a410ea0f143cca6216ab6\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"url\": \"http://10.189.210.97:8004/v1/a2346861d18a485f87d31f3db081f690\",\n" +
                "                        \"interface\": \"public\",\n" +
                "                        \"region\": \"RegionOne\",\n" +
                "                        \"region_id\": \"RegionOne\",\n" +
                "                        \"id\": \"60d6b5a908684751a37ca8ed35d431da\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"url\": \"http://10.189.210.97:8004/v1/a2346861d18a485f87d31f3db081f690\",\n" +
                "                        \"interface\": \"admin\",\n" +
                "                        \"region\": \"RegionOne\",\n" +
                "                        \"region_id\": \"RegionOne\",\n" +
                "                        \"id\": \"7ef7dccb21fa4a85b3b2a0ed20c9f1a8\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"type\": \"orchestration\",\n" +
                "                \"id\": \"481c5c5cd0fb4fbd9e15261403dc68e9\",\n" +
                "                \"name\": \"heat\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"endpoints\": [],\n" +
                "                \"type\": \"volume\",\n" +
                "                \"id\": \"6a3bc406ab9b427da493d7ee2de23441\",\n" +
                "                \"name\": \"cinder\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"endpoints\": [\n" +
                "                    {\n" +
                "                        \"url\": \"http://10.189.210.97:5000/v3/\",\n" +
                "                        \"interface\": \"internal\",\n" +
                "                        \"region\": \"RegionOne\",\n" +
                "                        \"region_id\": \"RegionOne\",\n" +
                "                        \"id\": \"0da9ed363ba848a6b72fd7a2fc0be1fc\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"url\": \"http://10.189.210.97:63030/v3/\",\n" +
                "                        \"interface\": \"admin\",\n" +
                "                        \"region\": \"RegionOne\",\n" +
                "                        \"region_id\": \"RegionOne\",\n" +
                "                        \"id\": \"1fea4537aae84a8ab5b7200b701d2999\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"url\": \"http://10.189.210.97:63030/v3/\",\n" +
                "                        \"interface\": \"public\",\n" +
                "                        \"region\": \"RegionOne\",\n" +
                "                        \"region_id\": \"RegionOne\",\n" +
                "                        \"id\": \"b8d80d81de4a4ba1800fce4f9e097222\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"type\": \"identity\",\n" +
                "                \"id\": \"708b32930bb44797a604fbb1f142cbf7\",\n" +
                "                \"name\": \"keystone\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"endpoints\": [\n" +
                "                    {\n" +
                "                        \"url\": \"http://10.189.210.97:8774/v2.1\",\n" +
                "                        \"interface\": \"public\",\n" +
                "                        \"region\": \"RegionOne\",\n" +
                "                        \"region_id\": \"RegionOne\",\n" +
                "                        \"id\": \"5268e3ccd7d14c9dbc08b0fcdf14f03e\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"url\": \"http://10.189.210.97:8774/v2.1\",\n" +
                "                        \"interface\": \"admin\",\n" +
                "                        \"region\": \"RegionOne\",\n" +
                "                        \"region_id\": \"RegionOne\",\n" +
                "                        \"id\": \"824fbf40ace84e8b88bf256dc02b8ca8\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"url\": \"http://10.189.210.97:8774/v2.1\",\n" +
                "                        \"interface\": \"internal\",\n" +
                "                        \"region\": \"RegionOne\",\n" +
                "                        \"region_id\": \"RegionOne\",\n" +
                "                        \"id\": \"d5f9d43496594d9eb093c530fefd6012\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"type\": \"compute\",\n" +
                "                \"id\": \"83c236d8c4b0456e88c519b5fe2c6781\",\n" +
                "                \"name\": \"nova\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"endpoints\": [\n" +
                "                    {\n" +
                "                        \"url\": \"http://10.189.210.97:8778\",\n" +
                "                        \"interface\": \"admin\",\n" +
                "                        \"region\": \"RegionOne\",\n" +
                "                        \"region_id\": \"RegionOne\",\n" +
                "                        \"id\": \"24fe60ba3eb446ddab0196f33fbc7ab4\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"url\": \"http://10.189.210.97:8778\",\n" +
                "                        \"interface\": \"internal\",\n" +
                "                        \"region\": \"RegionOne\",\n" +
                "                        \"region_id\": \"RegionOne\",\n" +
                "                        \"id\": \"9b434f6d08454738b857e77f33856b64\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"url\": \"http://10.189.210.97:8778\",\n" +
                "                        \"interface\": \"public\",\n" +
                "                        \"region\": \"RegionOne\",\n" +
                "                        \"region_id\": \"RegionOne\",\n" +
                "                        \"id\": \"eeb8c2788fb3439399561ae006487c87\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"type\": \"placement\",\n" +
                "                \"id\": \"9e79505f04cd41c18ae234a9eb629669\",\n" +
                "                \"name\": \"placement\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"endpoints\": [\n" +
                "                    {\n" +
                "                        \"url\": \"http://10.189.210.97:8787\",\n" +
                "                        \"interface\": \"internal\",\n" +
                "                        \"region\": \"RegionOne\",\n" +
                "                        \"region_id\": \"RegionOne\",\n" +
                "                        \"id\": \"083792d166f648819a9cc41849e9f41d\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"url\": \"http://10.189.210.97:8787\",\n" +
                "                        \"interface\": \"public\",\n" +
                "                        \"region\": \"RegionOne\",\n" +
                "                        \"region_id\": \"RegionOne\",\n" +
                "                        \"id\": \"0c9d21fad30f4c7994f3be32c58e0ed7\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"url\": \"http://10.189.210.97:8787\",\n" +
                "                        \"interface\": \"admin\",\n" +
                "                        \"region\": \"RegionOne\",\n" +
                "                        \"region_id\": \"RegionOne\",\n" +
                "                        \"id\": \"3af3cb8309d0475baaaed5ec90854e21\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"type\": \"clustering\",\n" +
                "                \"id\": \"a689d90140dc4698b1d7a09a438f688b\",\n" +
                "                \"name\": \"senlin\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"endpoints\": [\n" +
                "                    {\n" +
                "                        \"url\": \"http://10.189.210.97:8776/v3/a2346861d18a485f87d31f3db081f690\",\n" +
                "                        \"interface\": \"internal\",\n" +
                "                        \"region\": \"RegionOne\",\n" +
                "                        \"region_id\": \"RegionOne\",\n" +
                "                        \"id\": \"0a31afc87c054a9797fbdf4ca1cc4440\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"url\": \"http://10.189.210.97:8776/v3/a2346861d18a485f87d31f3db081f690\",\n" +
                "                        \"interface\": \"admin\",\n" +
                "                        \"region\": \"RegionOne\",\n" +
                "                        \"region_id\": \"RegionOne\",\n" +
                "                        \"id\": \"2027c860edd84f10b1fca7cf9ca83766\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"url\": \"http://10.189.210.97:8776/v3/a2346861d18a485f87d31f3db081f690\",\n" +
                "                        \"interface\": \"public\",\n" +
                "                        \"region\": \"RegionOne\",\n" +
                "                        \"region_id\": \"RegionOne\",\n" +
                "                        \"id\": \"b4fe5d3ecf1a4a899a8fbc20cc97af07\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"type\": \"volumev3\",\n" +
                "                \"id\": \"a8b259c9903b462d88d5d81e5ff19c05\",\n" +
                "                \"name\": \"cinderv3\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"endpoints\": [\n" +
                "                    {\n" +
                "                        \"url\": \"http://10.189.210.97:9696\",\n" +
                "                        \"interface\": \"internal\",\n" +
                "                        \"region\": \"RegionOne\",\n" +
                "                        \"region_id\": \"RegionOne\",\n" +
                "                        \"id\": \"76b1f0b4d4b4441a901f5357f5595bcc\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"url\": \"http://10.189.210.97:9696\",\n" +
                "                        \"interface\": \"admin\",\n" +
                "                        \"region\": \"RegionOne\",\n" +
                "                        \"region_id\": \"RegionOne\",\n" +
                "                        \"id\": \"9d7f05c202f8474ba3021d33e1ca543c\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"url\": \"http://10.189.210.97:9696\",\n" +
                "                        \"interface\": \"public\",\n" +
                "                        \"region\": \"RegionOne\",\n" +
                "                        \"region_id\": \"RegionOne\",\n" +
                "                        \"id\": \"ad1ff5fee6c241ecadbe0b5dcc69821c\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"type\": \"network\",\n" +
                "                \"id\": \"aa092a8cd7e74ea8898e0359b06ab9fa\",\n" +
                "                \"name\": \"neutron\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"endpoints\": [\n" +
                "                    {\n" +
                "                        \"url\": \"http://10.189.210.97:8777\",\n" +
                "                        \"interface\": \"admin\",\n" +
                "                        \"region\": \"RegionOne\",\n" +
                "                        \"region_id\": \"RegionOne\",\n" +
                "                        \"id\": \"00d5b92a15f94ddd879f7a0f6ecd5622\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"url\": \"http://10.189.210.97:8777\",\n" +
                "                        \"interface\": \"public\",\n" +
                "                        \"region\": \"RegionOne\",\n" +
                "                        \"region_id\": \"RegionOne\",\n" +
                "                        \"id\": \"dd49cd15ab9e47789c460177a04cf6b4\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"url\": \"http://10.189.210.97:8777\",\n" +
                "                        \"interface\": \"internal\",\n" +
                "                        \"region\": \"RegionOne\",\n" +
                "                        \"region_id\": \"RegionOne\",\n" +
                "                        \"id\": \"df73bbf7d7c94c8980cb717c27dcfba6\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"type\": \"metering\",\n" +
                "                \"id\": \"eabec3b6b9094da4a48ef5e620060f36\",\n" +
                "                \"name\": \"ceilometer\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"endpoints\": [\n" +
                "                    {\n" +
                "                        \"url\": \"http://10.189.210.97:63041\",\n" +
                "                        \"interface\": \"internal\",\n" +
                "                        \"region\": \"RegionOne\",\n" +
                "                        \"region_id\": \"RegionOne\",\n" +
                "                        \"id\": \"0a74969a18e0498e990a7383d250d1ef\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"url\": \"http://10.189.210.97:63041\",\n" +
                "                        \"interface\": \"public\",\n" +
                "                        \"region\": \"RegionOne\",\n" +
                "                        \"region_id\": \"RegionOne\",\n" +
                "                        \"id\": \"3f667421529343e495503ef33fb82ee4\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"url\": \"http://10.189.210.97:63041\",\n" +
                "                        \"interface\": \"admin\",\n" +
                "                        \"region\": \"RegionOne\",\n" +
                "                        \"region_id\": \"RegionOne\",\n" +
                "                        \"id\": \"4f02da1c8e8745e281b54d49a26670cd\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"type\": \"image\",\n" +
                "                \"id\": \"f14f5ee765a94dc1932f907165f43c9a\",\n" +
                "                \"name\": \"glance\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"user\": {\n" +
                "            \"password_expires_at\": null,\n" +
                "            \"domain\": {\n" +
                "                \"id\": \"default\",\n" +
                "                \"name\": \"Default\"\n" +
                "            },\n" +
                "            \"id\": \"edc548ea04b444b0b656508dc433e179\",\n" +
                "            \"name\": \"mano9qa\"\n" +
                "        },\n" +
                "        \"audit_ids\": [\n" +
                "            \"jdByUNxyQsiHFLO5X_irVg\"\n" +
                "        ],\n" +
                "        \"issued_at\": \"2018-09-14T01:43:27.000000Z\"\n" +
                "    }\n" +
                "}";
    }
}
