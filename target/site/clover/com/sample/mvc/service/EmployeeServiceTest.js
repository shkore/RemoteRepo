var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":170,"id":294,"methods":[{"el":38,"sc":2,"sl":26},{"el":53,"sc":2,"sl":44},{"el":73,"sc":2,"sl":58},{"el":93,"sc":2,"sl":78},{"el":110,"sc":2,"sl":95},{"el":127,"sc":2,"sl":112},{"el":148,"sc":2,"sl":129},{"el":169,"sc":2,"sl":150}],"name":"EmployeeServiceTest","sl":15}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1":{"methods":[{"sl":129}],"name":"editEmployeeTrue","pass":true,"statements":[{"sl":131},{"sl":132},{"sl":133},{"sl":134},{"sl":135},{"sl":136},{"sl":137},{"sl":138},{"sl":139},{"sl":141},{"sl":142},{"sl":143},{"sl":144},{"sl":145},{"sl":146},{"sl":147}]},"test_100":{"methods":[{"sl":150}],"name":"editEmployeeFalse","pass":true,"statements":[{"sl":152},{"sl":153},{"sl":154},{"sl":155},{"sl":156},{"sl":157},{"sl":158},{"sl":159},{"sl":160},{"sl":162},{"sl":163},{"sl":164},{"sl":165},{"sl":166},{"sl":167},{"sl":168}]},"test_102":{"methods":[{"sl":26}],"name":"testAddTrue","pass":true,"statements":[{"sl":28},{"sl":29},{"sl":30},{"sl":31},{"sl":32},{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":37}]},"test_105":{"methods":[{"sl":26}],"name":"testAddTrue","pass":true,"statements":[{"sl":28},{"sl":29},{"sl":30},{"sl":31},{"sl":32},{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":37}]},"test_108":{"methods":[{"sl":58}],"name":"findByEmployeeCodeTrue","pass":true,"statements":[{"sl":61},{"sl":62},{"sl":63},{"sl":64},{"sl":65},{"sl":66},{"sl":67},{"sl":68},{"sl":70},{"sl":71}]},"test_111":{"methods":[{"sl":78}],"name":"findByEmployeeCodeFalse","pass":true,"statements":[{"sl":81},{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86},{"sl":87},{"sl":88},{"sl":90},{"sl":91},{"sl":92}]},"test_114":{"methods":[{"sl":129}],"name":"editEmployeeTrue","pass":true,"statements":[{"sl":131},{"sl":132},{"sl":133},{"sl":134},{"sl":135},{"sl":136},{"sl":137},{"sl":138},{"sl":139},{"sl":141},{"sl":142},{"sl":143},{"sl":144},{"sl":145},{"sl":146},{"sl":147}]},"test_115":{"methods":[{"sl":44}],"name":"testAddFalse","pass":true,"statements":[{"sl":46},{"sl":47},{"sl":48},{"sl":49},{"sl":50},{"sl":51},{"sl":52}]},"test_117":{"methods":[{"sl":44}],"name":"testAddFalse","pass":true,"statements":[{"sl":46},{"sl":47},{"sl":48},{"sl":49},{"sl":50},{"sl":51},{"sl":52}]},"test_120":{"methods":[{"sl":58}],"name":"findByEmployeeCodeTrue","pass":true,"statements":[{"sl":61},{"sl":62},{"sl":63},{"sl":64},{"sl":65},{"sl":66},{"sl":67},{"sl":68},{"sl":70},{"sl":71}]},"test_121":{"methods":[{"sl":26}],"name":"testAddTrue","pass":true,"statements":[{"sl":28},{"sl":29},{"sl":30},{"sl":31},{"sl":32},{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":37}]},"test_122":{"methods":[{"sl":129}],"name":"editEmployeeTrue","pass":true,"statements":[{"sl":131},{"sl":132},{"sl":133},{"sl":134},{"sl":135},{"sl":136},{"sl":137},{"sl":138},{"sl":139},{"sl":141},{"sl":142},{"sl":143},{"sl":144},{"sl":145},{"sl":146},{"sl":147}]},"test_13":{"methods":[{"sl":78}],"name":"findByEmployeeCodeFalse","pass":true,"statements":[{"sl":81},{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86},{"sl":87},{"sl":88},{"sl":90},{"sl":91},{"sl":92}]},"test_134":{"methods":[{"sl":78}],"name":"findByEmployeeCodeFalse","pass":true,"statements":[{"sl":81},{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86},{"sl":87},{"sl":88},{"sl":90},{"sl":91},{"sl":92}]},"test_14":{"methods":[{"sl":78}],"name":"findByEmployeeCodeFalse","pass":true,"statements":[{"sl":81},{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86},{"sl":87},{"sl":88},{"sl":90},{"sl":91},{"sl":92}]},"test_15":{"methods":[{"sl":58}],"name":"findByEmployeeCodeTrue","pass":true,"statements":[{"sl":61},{"sl":62},{"sl":63},{"sl":64},{"sl":65},{"sl":66},{"sl":67},{"sl":68},{"sl":70},{"sl":71}]},"test_18":{"methods":[{"sl":112}],"name":"deleteEmployeeFalse","pass":true,"statements":[{"sl":114},{"sl":115},{"sl":116},{"sl":117},{"sl":118},{"sl":119},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":124},{"sl":125},{"sl":126}]},"test_21":{"methods":[{"sl":112}],"name":"deleteEmployeeFalse","pass":true,"statements":[{"sl":114},{"sl":115},{"sl":116},{"sl":117},{"sl":118},{"sl":119},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":124},{"sl":125},{"sl":126}]},"test_23":{"methods":[{"sl":95}],"name":"deleteEmployeeTrue","pass":true,"statements":[{"sl":97},{"sl":98},{"sl":99},{"sl":100},{"sl":101},{"sl":102},{"sl":103},{"sl":104},{"sl":105},{"sl":106},{"sl":107},{"sl":108},{"sl":109}]},"test_24":{"methods":[{"sl":95}],"name":"deleteEmployeeTrue","pass":true,"statements":[{"sl":97},{"sl":98},{"sl":99},{"sl":100},{"sl":101},{"sl":102},{"sl":103},{"sl":104},{"sl":105},{"sl":106},{"sl":107},{"sl":108},{"sl":109}]},"test_27":{"methods":[{"sl":44}],"name":"testAddFalse","pass":true,"statements":[{"sl":46},{"sl":47},{"sl":48},{"sl":49},{"sl":50},{"sl":51},{"sl":52}]},"test_3":{"methods":[{"sl":112}],"name":"deleteEmployeeFalse","pass":true,"statements":[{"sl":114},{"sl":115},{"sl":116},{"sl":117},{"sl":118},{"sl":119},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":124},{"sl":125},{"sl":126}]},"test_32":{"methods":[{"sl":44}],"name":"testAddFalse","pass":true,"statements":[{"sl":46},{"sl":47},{"sl":48},{"sl":49},{"sl":50},{"sl":51},{"sl":52}]},"test_33":{"methods":[{"sl":95}],"name":"deleteEmployeeTrue","pass":true,"statements":[{"sl":97},{"sl":98},{"sl":99},{"sl":100},{"sl":101},{"sl":102},{"sl":103},{"sl":104},{"sl":105},{"sl":106},{"sl":107},{"sl":108},{"sl":109}]},"test_36":{"methods":[{"sl":26}],"name":"testAddTrue","pass":true,"statements":[{"sl":28},{"sl":29},{"sl":30},{"sl":31},{"sl":32},{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":37}]},"test_4":{"methods":[{"sl":112}],"name":"deleteEmployeeFalse","pass":true,"statements":[{"sl":114},{"sl":115},{"sl":116},{"sl":117},{"sl":118},{"sl":119},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":124},{"sl":125},{"sl":126}]},"test_42":{"methods":[{"sl":58}],"name":"findByEmployeeCodeTrue","pass":true,"statements":[{"sl":61},{"sl":62},{"sl":63},{"sl":64},{"sl":65},{"sl":66},{"sl":67},{"sl":68},{"sl":70},{"sl":71}]},"test_49":{"methods":[{"sl":95}],"name":"deleteEmployeeTrue","pass":true,"statements":[{"sl":97},{"sl":98},{"sl":99},{"sl":100},{"sl":101},{"sl":102},{"sl":103},{"sl":104},{"sl":105},{"sl":106},{"sl":107},{"sl":108},{"sl":109}]},"test_51":{"methods":[{"sl":78}],"name":"findByEmployeeCodeFalse","pass":true,"statements":[{"sl":81},{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86},{"sl":87},{"sl":88},{"sl":90},{"sl":91},{"sl":92}]},"test_53":{"methods":[{"sl":44}],"name":"testAddFalse","pass":true,"statements":[{"sl":46},{"sl":47},{"sl":48},{"sl":49},{"sl":50},{"sl":51},{"sl":52}]},"test_55":{"methods":[{"sl":95}],"name":"deleteEmployeeTrue","pass":true,"statements":[{"sl":97},{"sl":98},{"sl":99},{"sl":100},{"sl":101},{"sl":102},{"sl":103},{"sl":104},{"sl":105},{"sl":106},{"sl":107},{"sl":108},{"sl":109}]},"test_59":{"methods":[{"sl":129}],"name":"editEmployeeTrue","pass":true,"statements":[{"sl":131},{"sl":132},{"sl":133},{"sl":134},{"sl":135},{"sl":136},{"sl":137},{"sl":138},{"sl":139},{"sl":141},{"sl":142},{"sl":143},{"sl":144},{"sl":145},{"sl":146},{"sl":147}]},"test_60":{"methods":[{"sl":44}],"name":"testAddFalse","pass":true,"statements":[{"sl":46},{"sl":47},{"sl":48},{"sl":49},{"sl":50},{"sl":51},{"sl":52}]},"test_64":{"methods":[{"sl":150}],"name":"editEmployeeFalse","pass":true,"statements":[{"sl":152},{"sl":153},{"sl":154},{"sl":155},{"sl":156},{"sl":157},{"sl":158},{"sl":159},{"sl":160},{"sl":162},{"sl":163},{"sl":164},{"sl":165},{"sl":166},{"sl":167},{"sl":168}]},"test_65":{"methods":[{"sl":58}],"name":"findByEmployeeCodeTrue","pass":true,"statements":[{"sl":61},{"sl":62},{"sl":63},{"sl":64},{"sl":65},{"sl":66},{"sl":67},{"sl":68},{"sl":70},{"sl":71}]},"test_71":{"methods":[{"sl":150}],"name":"editEmployeeFalse","pass":true,"statements":[{"sl":152},{"sl":153},{"sl":154},{"sl":155},{"sl":156},{"sl":157},{"sl":158},{"sl":159},{"sl":160},{"sl":162},{"sl":163},{"sl":164},{"sl":165},{"sl":166},{"sl":167},{"sl":168}]},"test_77":{"methods":[{"sl":78}],"name":"findByEmployeeCodeFalse","pass":true,"statements":[{"sl":81},{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86},{"sl":87},{"sl":88},{"sl":90},{"sl":91},{"sl":92}]},"test_78":{"methods":[{"sl":58}],"name":"findByEmployeeCodeTrue","pass":true,"statements":[{"sl":61},{"sl":62},{"sl":63},{"sl":64},{"sl":65},{"sl":66},{"sl":67},{"sl":68},{"sl":70},{"sl":71}]},"test_80":{"methods":[{"sl":112}],"name":"deleteEmployeeFalse","pass":true,"statements":[{"sl":114},{"sl":115},{"sl":116},{"sl":117},{"sl":118},{"sl":119},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":124},{"sl":125},{"sl":126}]},"test_82":{"methods":[{"sl":112}],"name":"deleteEmployeeFalse","pass":true,"statements":[{"sl":114},{"sl":115},{"sl":116},{"sl":117},{"sl":118},{"sl":119},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":124},{"sl":125},{"sl":126}]},"test_85":{"methods":[{"sl":150}],"name":"editEmployeeFalse","pass":true,"statements":[{"sl":152},{"sl":153},{"sl":154},{"sl":155},{"sl":156},{"sl":157},{"sl":158},{"sl":159},{"sl":160},{"sl":162},{"sl":163},{"sl":164},{"sl":165},{"sl":166},{"sl":167},{"sl":168}]},"test_86":{"methods":[{"sl":150}],"name":"editEmployeeFalse","pass":true,"statements":[{"sl":152},{"sl":153},{"sl":154},{"sl":155},{"sl":156},{"sl":157},{"sl":158},{"sl":159},{"sl":160},{"sl":162},{"sl":163},{"sl":164},{"sl":165},{"sl":166},{"sl":167},{"sl":168}]},"test_87":{"methods":[{"sl":150}],"name":"editEmployeeFalse","pass":true,"statements":[{"sl":152},{"sl":153},{"sl":154},{"sl":155},{"sl":156},{"sl":157},{"sl":158},{"sl":159},{"sl":160},{"sl":162},{"sl":163},{"sl":164},{"sl":165},{"sl":166},{"sl":167},{"sl":168}]},"test_88":{"methods":[{"sl":26}],"name":"testAddTrue","pass":true,"statements":[{"sl":28},{"sl":29},{"sl":30},{"sl":31},{"sl":32},{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":37}]},"test_91":{"methods":[{"sl":129}],"name":"editEmployeeTrue","pass":true,"statements":[{"sl":131},{"sl":132},{"sl":133},{"sl":134},{"sl":135},{"sl":136},{"sl":137},{"sl":138},{"sl":139},{"sl":141},{"sl":142},{"sl":143},{"sl":144},{"sl":145},{"sl":146},{"sl":147}]},"test_93":{"methods":[{"sl":26}],"name":"testAddTrue","pass":true,"statements":[{"sl":28},{"sl":29},{"sl":30},{"sl":31},{"sl":32},{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":37}]},"test_94":{"methods":[{"sl":129}],"name":"editEmployeeTrue","pass":true,"statements":[{"sl":131},{"sl":132},{"sl":133},{"sl":134},{"sl":135},{"sl":136},{"sl":137},{"sl":138},{"sl":139},{"sl":141},{"sl":142},{"sl":143},{"sl":144},{"sl":145},{"sl":146},{"sl":147}]},"test_97":{"methods":[{"sl":95}],"name":"deleteEmployeeTrue","pass":true,"statements":[{"sl":97},{"sl":98},{"sl":99},{"sl":100},{"sl":101},{"sl":102},{"sl":103},{"sl":104},{"sl":105},{"sl":106},{"sl":107},{"sl":108},{"sl":109}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [88, 121, 36, 105, 102, 93], [], [88, 121, 36, 105, 102, 93], [88, 121, 36, 105, 102, 93], [88, 121, 36, 105, 102, 93], [88, 121, 36, 105, 102, 93], [88, 121, 36, 105, 102, 93], [88, 121, 36, 105, 102, 93], [88, 121, 36, 105, 102, 93], [88, 121, 36, 105, 102, 93], [88, 121, 36, 105, 102, 93], [88, 121, 36, 105, 102, 93], [], [], [], [], [], [], [53, 60, 117, 27, 115, 32], [], [53, 60, 117, 27, 115, 32], [53, 60, 117, 27, 115, 32], [53, 60, 117, 27, 115, 32], [53, 60, 117, 27, 115, 32], [53, 60, 117, 27, 115, 32], [53, 60, 117, 27, 115, 32], [53, 60, 117, 27, 115, 32], [], [], [], [], [], [15, 108, 65, 120, 42, 78], [], [], [15, 108, 65, 120, 42, 78], [15, 108, 65, 120, 42, 78], [15, 108, 65, 120, 42, 78], [15, 108, 65, 120, 42, 78], [15, 108, 65, 120, 42, 78], [15, 108, 65, 120, 42, 78], [15, 108, 65, 120, 42, 78], [15, 108, 65, 120, 42, 78], [], [15, 108, 65, 120, 42, 78], [15, 108, 65, 120, 42, 78], [], [], [], [], [], [], [14, 77, 111, 51, 134, 13], [], [], [14, 77, 111, 51, 134, 13], [14, 77, 111, 51, 134, 13], [14, 77, 111, 51, 134, 13], [14, 77, 111, 51, 134, 13], [14, 77, 111, 51, 134, 13], [14, 77, 111, 51, 134, 13], [14, 77, 111, 51, 134, 13], [14, 77, 111, 51, 134, 13], [], [14, 77, 111, 51, 134, 13], [14, 77, 111, 51, 134, 13], [14, 77, 111, 51, 134, 13], [], [], [97, 24, 55, 33, 23, 49], [], [97, 24, 55, 33, 23, 49], [97, 24, 55, 33, 23, 49], [97, 24, 55, 33, 23, 49], [97, 24, 55, 33, 23, 49], [97, 24, 55, 33, 23, 49], [97, 24, 55, 33, 23, 49], [97, 24, 55, 33, 23, 49], [97, 24, 55, 33, 23, 49], [97, 24, 55, 33, 23, 49], [97, 24, 55, 33, 23, 49], [97, 24, 55, 33, 23, 49], [97, 24, 55, 33, 23, 49], [97, 24, 55, 33, 23, 49], [], [], [21, 3, 82, 4, 80, 18], [], [21, 3, 82, 4, 80, 18], [21, 3, 82, 4, 80, 18], [21, 3, 82, 4, 80, 18], [21, 3, 82, 4, 80, 18], [21, 3, 82, 4, 80, 18], [21, 3, 82, 4, 80, 18], [21, 3, 82, 4, 80, 18], [21, 3, 82, 4, 80, 18], [21, 3, 82, 4, 80, 18], [21, 3, 82, 4, 80, 18], [21, 3, 82, 4, 80, 18], [21, 3, 82, 4, 80, 18], [21, 3, 82, 4, 80, 18], [], [], [1, 94, 122, 114, 59, 91], [], [1, 94, 122, 114, 59, 91], [1, 94, 122, 114, 59, 91], [1, 94, 122, 114, 59, 91], [1, 94, 122, 114, 59, 91], [1, 94, 122, 114, 59, 91], [1, 94, 122, 114, 59, 91], [1, 94, 122, 114, 59, 91], [1, 94, 122, 114, 59, 91], [1, 94, 122, 114, 59, 91], [], [1, 94, 122, 114, 59, 91], [1, 94, 122, 114, 59, 91], [1, 94, 122, 114, 59, 91], [1, 94, 122, 114, 59, 91], [1, 94, 122, 114, 59, 91], [1, 94, 122, 114, 59, 91], [1, 94, 122, 114, 59, 91], [], [], [86, 87, 71, 64, 100, 85], [], [86, 87, 71, 64, 100, 85], [86, 87, 71, 64, 100, 85], [86, 87, 71, 64, 100, 85], [86, 87, 71, 64, 100, 85], [86, 87, 71, 64, 100, 85], [86, 87, 71, 64, 100, 85], [86, 87, 71, 64, 100, 85], [86, 87, 71, 64, 100, 85], [86, 87, 71, 64, 100, 85], [], [86, 87, 71, 64, 100, 85], [86, 87, 71, 64, 100, 85], [86, 87, 71, 64, 100, 85], [86, 87, 71, 64, 100, 85], [86, 87, 71, 64, 100, 85], [86, 87, 71, 64, 100, 85], [86, 87, 71, 64, 100, 85], [], []]