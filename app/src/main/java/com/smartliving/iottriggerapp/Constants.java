package com.smartliving.iottriggerapp;

public enum Constants {
    ;

    public static final String CLIENT_ENDPOINT = "a1pdhwhdkdviji-ats.iot.eu-central-1.amazonaws.com";
    public static final String CLIENT_ID = "SmartLightSwitch_v2";
    public static final String CERTIFICATE =    "MIIDWTCCAkGgAwIBAgIUMrsh+zJ1hczMYKG9lIczAZT99ZswDQYJKoZIhvcNAQEL\n" +
                                                "BQAwTTFLMEkGA1UECwxCQW1hem9uIFdlYiBTZXJ2aWNlcyBPPUFtYXpvbi5jb20g\n" +
                                                "SW5jLiBMPVNlYXR0bGUgU1Q9V2FzaGluZ3RvbiBDPVVTMB4XDTE5MDUxMjA4MTkx\n" +
                                                "NVoXDTQ5MTIzMTIzNTk1OVowHjEcMBoGA1UEAwwTQVdTIElvVCBDZXJ0aWZpY2F0\n" +
                                                "ZTCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAKROG3kpwvufDg8fBJSg\n" +
                                                "DlfuS6+EtG/4OOWQ2RtaR5o7kFt7j+Dor+vGS6jqm8ESgRvJHW0I6Nb5UPDCndh7\n" +
                                                "FEpu8kvMOAZDHJvWbGVj4rY4mjFs2WrTNbUg8Dd/nLsU7XSrATo2BNSc160xc5rF\n" +
                                                "3NNN9gRI3h0UsNlsJZRJZzd8xLNDTjp3PNo+GH5L5EwItqa/VIZkXyy+Jd0MgJmw\n" +
                                                "YBpv7I/7kvI1hVwpOKStzdQv8EYGTI3wX4+WcFFeFNyQ4tVjm7ueVswb6++z3oyi\n" +
                                                "0Fqn1DmjKlnN5Dzhwrgd0FkyJ6U016OIXly4uCmydKLOGwyuJoeI1H368pKho0Pt\n" +
                                                "XF0CAwEAAaNgMF4wHwYDVR0jBBgwFoAUmMLpX7MXB0aX7EYSCeR5CRyvXmgwHQYD\n" +
                                                "VR0OBBYEFPogQp39Kj1oemPA1wF5ZHyCpNSJMAwGA1UdEwEB/wQCMAAwDgYDVR0P\n" +
                                                "AQH/BAQDAgeAMA0GCSqGSIb3DQEBCwUAA4IBAQBaauD9lybr9o8Uu0kP8VoKiu6d\n" +
                                                "/oUrKjE1OLa5MAAWrknY1YTKqkcbWgHGBdA0LyTjjY+92/M1ytwxxMA9AJbHL+lw\n" +
                                                "zeKvgfGHPSnzMjDWBIzQqnqdfg/+fLf2RhQiadcpSerT50vW4kehmb5WgzUdmvka\n" +
                                                "nXTYCDBw84jOLpjMlzWz5uXMlFkXQOD11sgKi7N1RSmBEwwqx1qFlYQGx7e2duff\n" +
                                                "aAEGEruVpJrmWL8CJW9MAG6Wa5QCXCD7vj+SQqdaD6r5i5E0w+sRVF+9nH6MRjWt\n" +
                                                "wzEKBy7cSn89HFedHij24Xk2M0phUY51YWKvb8McoqHBxUDvnimv71n57T48";
    public static final String PRIVATE_KEY =    "MIIEpAIBAAKCAQEApE4beSnC+58ODx8ElKAOV+5Lr4S0b/g45ZDZG1pHmjuQW3uP\n" +
                                                "4Oiv68ZLqOqbwRKBG8kdbQjo1vlQ8MKd2HsUSm7yS8w4BkMcm9ZsZWPitjiaMWzZ\n" +
                                                "atM1tSDwN3+cuxTtdKsBOjYE1JzXrTFzmsXc0032BEjeHRSw2WwllElnN3zEs0NO\n" +
                                                "Onc82j4YfkvkTAi2pr9UhmRfLL4l3QyAmbBgGm/sj/uS8jWFXCk4pK3N1C/wRgZM\n" +
                                                "jfBfj5ZwUV4U3JDi1WObu55WzBvr77PejKLQWqfUOaMqWc3kPOHCuB3QWTInpTTX\n" +
                                                "o4heXLi4KbJ0os4bDK4mh4jUffrykqGjQ+1cXQIDAQABAoIBACXi/OLLhnKPEqbZ\n" +
                                                "+CxtW+FayYkHiLPpAPWumOF9x9UAtyDhNSQfg7FSYE/rCU9T/QFzNp3V2Br6Enfx\n" +
                                                "6IPqnZssSiLATIrlHsuwff5DMhvioWuUNe40FcZWeg3SF0nsYXTtmbLakfKU2AbP\n" +
                                                "yGCAD5OJ/piuVMlP5Be+oEu5QVvBwtKqZZ1IbGKXWg++TLCLiqJDCZpTTzgPmHYc\n" +
                                                "CtFbGc3XRQ4HX2emlW3B9QiEMiJ2YhHweJostBrzOYBWm7jwWmzSZYPRpvq8GV/9\n" +
                                                "T0J68crqzaqDyHtA8c/p6ffUHGIQVbPiEhfqen4vpT7qJ8RyuoBjarjl9VsZfKPx\n" +
                                                "+t3y6QECgYEA1QvvXL47LUFGeaxTnvvyOITxYwzsMBMwjqZQ9MrRx4SYBL0ldhvT\n" +
                                                "EQueXc9lfT8qGDgV/JYOCHekKIOq6DyBf6vcYNQA3Bdo3Av80NYTyvMI6qh9sP2h\n" +
                                                "0YTBORPBZno/eaChyLwD+GHxVgTW3F1eRz6nqT91a6RuKz6+wfWfMKkCgYEAxW50\n" +
                                                "vBhjeCtEYdnS7WEGLSCfzO2p5OmZPJa9suHgtfo/H7RE4IwEc7Lw/Z7IM70g3xia\n" +
                                                "E+Mx66GDE9akeB5MC0G0dGVkpf+XNebatVtQvpAzBwVDglIekhhIwXKFim1NE5Zm\n" +
                                                "PCKG7rWgbjrSiYXnGqEz+M3S7lIMTwc0WT5Z+pUCgYA+t6W+eq33E5lIpmdzjR3w\n" +
                                                "b4qUKzC4sl2AEQwSFEcPYkRSWNBXZbeL9Ayp9y0cYuTkflZSpmX5LidgWeqNNYq1\n" +
                                                "6AUXaDHcmPOgm9LQM8Vd4JAGbJWb7f6eLGOphtxPa7uV9ajK7DaK/2JJfWE3PDFN\n" +
                                                "7e7zjx/lEWHxTyZe+QzlCQKBgQCteRA49XTw8ZN0JuCektHKdQ/0EB9nc5mhExI7\n" +
                                                "Sx0WyHsOcGbUpjKDNodpUUq3q0ZmwEchkk8aqx9xHvgEUxqeCW11mGGHObyzL9Sb\n" +
                                                "5VBdIHa1hHp814rk81F6KBYOO1uuCkhqLixBMnV0ZVr4Wx9k1p/DzZW4sX7/MWVd\n" +
                                                "xNtqwQKBgQCXIDe16CMZ+YZGCTL+A9hjogJt3qs5VxkqdzMsRb7oIrbreQvL1P1y\n" +
                                                "qMtf8cSaTy79wGu59qxuS6VjZ0uOghEPvggG+Kh8v5nbgmIERSfXM+8KcwuSXVOs\n" +
                                                "LFLsWstBNHu3KwCfHlVaMQQzgakJlhPwyU7vq9duJkSUArBTtNJLdQ==";
}
