package at.voyagers.pokemon.repository

class PokemonKrNameRepository(
    val map: Map<Int, String> = mapOf(
        1 to "이상해씨",
        2 to "이상해풀",
        3 to "이상해꽃",
        4 to "파이리",
        5 to "리자드",
        6 to "리자몽",
        7 to "꼬부기",
        8 to "어니부기",
        9 to "거북왕",
        10 to "캐터피",
        11 to "단데기",
        12 to "버터플",
        13 to "뿔충이",
        14 to "딱충이",
        15 to "독침붕",
        16 to "구구",
        17 to "피죤",
        18 to "피죤투",
        19 to "꼬렛",
        20 to "레트라",
        21 to "깨비참",
        22 to "깨비드릴조",
        23 to "아보",
        24 to "아보크",
        25 to "피카츄",
        26 to "라이츄",
        27 to "모래두지",
        28 to "고지",
        29 to "♀",
        30 to "니드리나",
        31 to "니드퀸",
        32 to "♂",
        33 to "니드리노",
        34 to "니드킹",
        35 to "삐삐",
        36 to "픽시",
        37 to "식스테일",
        38 to "나인테일",
        39 to "푸린",
        40 to "푸크린",
        41 to "주뱃",
        42 to "골뱃",
        43 to "뚜벅쵸",
        44 to "냄새꼬",
        45 to "라플레시아",
        46 to "파라스",
        47 to "파라섹트",
        48 to "콘팡",
        49 to "도나리",
        50 to "디그다",
        51 to "닥트리오",
        52 to "나옹",
        53 to "페르시온",
        54 to "고라파덕",
        55 to "골덕",
        56 to "망키",
        57 to "성원숭",
        58 to "가디",
        59 to "윈디",
        60 to "발챙이",
        61 to "슈륙챙이",
        62 to "강챙이",
        63 to "캐이시",
        64 to "윤겔라",
        65 to "후딘",
        66 to "알통몬",
        67 to "근육몬",
        68 to "괴력몬",
        69 to "모다피",
        70 to "우츠동",
        71 to "우츠보트",
        72 to "왕눈해",
        73 to "독파리",
        74 to "꼬마돌",
        75 to "데구리",
        76 to "딱구리",
        77 to "포니타",
        78 to "날쌩마",
        79 to "야돈",
        80 to "야도란",
        81 to "코일",
        82 to "레어코일",
        83 to "파오리",
        84 to "두두",
        85 to "두트리오",
        86 to "쥬쥬",
        87 to "쥬레곤",
        88 to "질퍽이",
        89 to "질뻐기",
        90 to "셀러",
        91 to "파르셀",
        92 to "고오스",
        93 to "고우스트",
        94 to "팬텀",
        95 to "롱스톤",
        96 to "슬리프",
        97 to "슬리퍼",
        98 to "크랩",
        99 to "킹크랩",
        100 to "찌리리공",
        101 to "붐볼",
        102 to "아라리",
        103 to "나시",
        104 to "탕구리",
        105 to "텅구리",
        106 to "시라소몬",
        107 to "홍수몬",
        108 to "내루미",
        109 to "또가스",
        110 to "또도가스",
        111 to "뿔카노",
        112 to "코뿌리",
        113 to "럭키",
        114 to "덩쿠리",
        115 to "캥카",
        116 to "쏘드라",
        117 to "시드라",
        118 to "콘치",
        119 to "왕콘치",
        120 to "별가사리",
        121 to "아쿠스타",
        122 to "마임맨",
        123 to "스라크",
        124 to "루주라",
        125 to "에레브",
        126 to "마그마",
        127 to "쁘사이저",
        128 to "켄타로스",
        129 to "잉어킹",
        130 to "갸라도스",
        131 to "라프라스",
        132 to "메타몽",
        133 to "이브이",
        134 to "샤미드",
        135 to "쥬피썬더",
        136 to "부스터",
        137 to "폴리곤",
        138 to "암나이트",
        139 to "암스타",
        140 to "투구",
        141 to "투구푸스",
        142 to "프테라",
        143 to "잠만보",
        144 to "프리져",
        145 to "썬더",
        146 to "파이어",
        147 to "미뇽",
        148 to "신뇽",
        149 to "망나뇽",
        150 to "뮤츠",
        151 to "뮤",
        152 to "치코리타",
        153 to "베이리프",
        154 to "메가니움",
        155 to "브케인",
        156 to "마그케인",
        157 to "블레이범",
        158 to "리아코",
        159 to "엘리게이",
        160 to "장크로다일",
        161 to "꼬리선",
        162 to "다꼬리",
        163 to "부우부",
        164 to "야부엉",
        165 to "레디바",
        166 to "레디안",
        167 to "페이검",
        168 to "아리아도스",
        169 to "크로뱃",
        170 to "초라기",
        171 to "랜턴",
        172 to "피츄",
        173 to "삐",
        174 to "푸푸린",
        175 to "토게피",
        176 to "토게틱",
        177 to "네이티",
        178 to "네이티오",
        179 to "메리프",
        180 to "보송송",
        181 to "전룡",
        182 to "아르코",
        183 to "마릴",
        184 to "마릴리",
        185 to "꼬지모",
        186 to "왕구리",
        187 to "통통코",
        188 to "두코",
        189 to "솜솜코",
        190 to "에이팜",
        191 to "해너츠",
        192 to "해루미",
        193 to "왕자리",
        194 to "우파",
        195 to "누오",
        196 to "에브이",
        197 to "블래키",
        198 to "니로우",
        199 to "야도킹",
        200 to "무우마",
        201 to "안농",
        202 to "마자용",
        203 to "키링키",
        204 to "피콘",
        205 to "쏘콘",
        206 to "노고치",
        207 to "글라이거",
        208 to "강철톤",
        209 to "블루",
        210 to "그랑블루",
        211 to "침바루",
        212 to "핫삼",
        213 to "단단지",
        214 to "헤라크로스",
        215 to "포푸니",
        216 to "깜지곰",
        217 to "링곰",
        218 to "마그마그",
        219 to "마그카르고",
        220 to "꾸꾸리",
        221 to "메꾸리",
        222 to "코산호",
        223 to "총어",
        224 to "대포무노",
        225 to "딜리버드",
        226 to "만타인",
        227 to "무장조",
        228 to "델빌",
        229 to "헬가",
        230 to "킹드라",
        231 to "코코리",
        232 to "코리갑",
        233 to "폴리곤2",
        234 to "노라키",
        235 to "루브도",
        236 to "배루키",
        237 to "카포에라",
        238 to "뽀뽀라",
        239 to "에레키드",
        240 to "마그비",
        241 to "밀탱크",
        242 to "해피너스",
        243 to "라이코",
        244 to "앤테이",
        245 to "스이쿤",
        246 to "애버라스",
        247 to "데기라스",
        248 to "마기라스",
        249 to "루기아",
        250 to "칠색조",
        251 to "세레비",
        252 to "나무지기",
        253 to "나무돌이",
        254 to "나무킹",
        255 to "아차모",
        256 to "영치코",
        257 to "번치코",
        258 to "물짱이",
        259 to "늪짱이",
        260 to "대짱이",
        261 to "포챠나",
        262 to "그라에나",
        263 to "지그제구리",
        264 to "직구리",
        265 to "개무소",
        266 to "실쿤",
        267 to "뷰티플라이",
        268 to "카스쿤",
        269 to "독케일",
        270 to "연꽃몬",
        271 to "로토스",
        272 to "로파파",
        273 to "도토링",
        274 to "잎새코",
        275 to "다탱구",
        276 to "테일로",
        277 to "스왈로",
        278 to "갈모매",
        279 to "패리퍼",
        280 to "랄토스",
        281 to "킬리아",
        282 to "가디안",
        283 to "비구술",
        284 to "비나방",
        285 to "버섯꼬",
        286 to "버섯모",
        287 to "게을로",
        288 to "발바로",
        289 to "게을킹",
        290 to "토중몬",
        291 to "아이스크",
        292 to "껍질몬",
        293 to "소곤룡",
        294 to "노공룡",
        295 to "폭음룡",
        296 to "마크탕",
        297 to "하리뭉",
        298 to "루리리",
        299 to "코코파스",
        300 to "에나비",
        301 to "델케티",
        302 to "깜까미",
        303 to "입치트",
        304 to "가보리",
        305 to "갱도라",
        306 to "보스로라",
        307 to "요가랑",
        308 to "요가램",
        309 to "썬더라이",
        310 to "썬더볼트",
        311 to "플러시",
        312 to "마이농",
        313 to "볼비트",
        314 to "네오비트",
        315 to "로젤리아",
        316 to "꼴깍몬",
        317 to "꿀꺽몬",
        318 to "샤프니아",
        319 to "샤크니아",
        320 to "고래왕자",
        321 to "고래왕",
        322 to "둔타",
        323 to "폭타",
        324 to "코터스",
        325 to "피그점프",
        326 to "피그킹",
        327 to "얼루기",
        328 to "톱치",
        329 to "비브라바",
        330 to "플라이곤",
        331 to "선인왕",
        332 to "밤선인",
        333 to "파비코",
        334 to "파비코리",
        335 to "쟝고",
        336 to "세비퍼",
        337 to "루나톤",
        338 to "솔록",
        339 to "미꾸리",
        340 to "메깅",
        341 to "가재군",
        342 to "가재장군",
        343 to "오뚝군",
        344 to "점토도리",
        345 to "릴링",
        346 to "릴리요",
        347 to "아노딥스",
        348 to "아말도",
        349 to "빈티나",
        350 to "밀로틱",
        351 to "캐스퐁",
        352 to "켈리몬",
        353 to "어둠대신",
        354 to "다크펫",
        355 to "해골몽",
        356 to "미라몽",
        357 to "트로피우스",
        358 to "치렁",
        359 to "앱솔",
        360 to "마자",
        361 to "눈꼬마",
        362 to "얼음귀신",
        363 to "대굴레오",
        364 to "씨레오",
        365 to "씨카이저",
        366 to "진주몽",
        367 to "헌테일",
        368 to "분홍장이",
        369 to "시라칸",
        370 to "사랑동이",
        371 to "아공이",
        372 to "쉘곤",
        373 to "보만다",
        374 to "메탕",
        375 to "메탕구",
        376 to "메타그로스",
        377 to "레지락",
        378 to "레지아이스",
        379 to "레지스틸",
        380 to "라티아스",
        381 to "라티오스",
        382 to "가이오가",
        383 to "그란돈",
        384 to "레쿠쟈",
        385 to "지라치",
        386 to "테오키스",
        387 to "모부기",
        388 to "수풀부기",
        389 to "토대부기",
        390 to "불꽃숭이",
        391 to "파이숭이",
        392 to "초염몽",
        393 to "팽도리",
        394 to "팽태자",
        395 to "엠페르트",
        396 to "찌르꼬",
        397 to "찌르버드",
        398 to "찌르호크",
        399 to "비버니",
        400 to "비버통",
        401 to "귀뚤뚜기",
        402 to "귀뚤톡크",
        403 to "꼬링크",
        404 to "럭시오",
        405 to "렌트라",
        406 to "꼬몽울",
        407 to "로즈레이드",
        408 to "두개도스",
        409 to "램펄드",
        410 to "방패톱스",
        411 to "바리톱스",
        412 to "도롱충이",
        413 to "도롱마담",
        414 to "나메일",
        415 to "세꿀버리",
        416 to "비퀸",
        417 to "파치리스",
        418 to "브이젤",
        419 to "플로젤",
        420 to "체리버",
        421 to "체리꼬",
        422 to "깝질무",
        423 to "트리토돈",
        424 to "겟핸보숭",
        425 to "흔들풍손",
        426 to "둥실라이드",
        427 to "이어롤",
        428 to "이어롭",
        429 to "무우마직",
        430 to "돈크로우",
        431 to "나옹마",
        432 to "몬냥이",
        433 to "랑딸랑",
        434 to "스컹뿡",
        435 to "스컹탱크",
        436 to "동미러",
        437 to "동탁군",
        438 to "꼬지지",
        439 to "흉내내",
        440 to "핑복",
        441 to "페라페",
        442 to "화강돌",
        443 to "딥상어동",
        444 to "한바이트",
        445 to "한카리아스",
        446 to "먹고자",
        447 to "리오르",
        448 to "루카리오",
        449 to "히포포타스",
        450 to "하마돈",
        451 to "스콜피",
        452 to "드래피온",
        453 to "삐딱구리",
        454 to "독개굴",
        455 to "무스틈니",
        456 to "형광어",
        457 to "네오라이트",
        458 to "타만타",
        459 to "눈쓰개",
        460 to "눈설왕",
        461 to "포푸니라",
        462 to "자포코일",
        463 to "내룸벨트",
        464 to "거대코뿌리",
        465 to "덩쿠림보",
        466 to "에레키블",
        467 to "마그마번",
        468 to "토게키스",
        469 to "메가자리",
        470 to "리피아",
        471 to "글레이시아",
        472 to "글라이온",
        473 to "맘모꾸리",
        474 to "폴리곤Z",
        475 to "엘레이드",
        476 to "대코파스",
        477 to "야느와르몽",
        478 to "눈여아",
        479 to "로토무",
        480 to "유크시",
        481 to "엠라이트",
        482 to "아그놈",
        483 to "디아루가",
        484 to "펄기아",
        485 to "히드런",
        486 to "레지기가스",
        487 to "기라티나",
        488 to "크레세리아",
        489 to "피오네",
        490 to "마나피",
        491 to "다크라이",
        492 to "쉐이미",
        493 to "아르세우스",
        494 to "비크티니",
        495 to "주리비얀",
        496 to "샤비",
        497 to "샤로다",
        498 to "뚜꾸리",
        499 to "차오꿀",
        500 to "염무왕",
        501 to "수댕이",
        502 to "쌍검자비",
        503 to "대검귀",
        504 to "보르쥐",
        505 to "보르그",
        506 to "요테리",
        507 to "하데리어",
        508 to "바랜드",
        509 to "쌔비냥",
        510 to "레파르다스",
        511 to "야나프",
        512 to "야나키",
        513 to "바오프",
        514 to "바오키",
        515 to "앗차프",
        516 to "앗차키",
        517 to "몽나",
        518 to "몽얌나",
        519 to "콩둘기",
        520 to "유토브",
        521 to "켄호로우",
        522 to "줄뮤마",
        523 to "제브라이카",
        524 to "단굴",
        525 to "암트르",
        526 to "기가이어스",
        527 to "또르박쥐",
        528 to "맘박쥐",
        529 to "두더류",
        530 to "몰드류",
        531 to "다부니",
        532 to "으랏차",
        533 to "토쇠골",
        534 to "노보청",
        535 to "동챙이",
        536 to "두까비",
        537 to "두빅굴",
        538 to "던지미",
        539 to "타격귀",
        540 to "두르보",
        541 to "두르쿤",
        542 to "모아머",
        543 to "마디네",
        544 to "휠구",
        545 to "펜드라",
        546 to "소미안",
        547 to "엘풍",
        548 to "치릴리",
        549 to "드레디어",
        550 to "배쓰나이",
        551 to "깜눈크",
        552 to "악비르",
        553 to "악비아르",
        554 to "달막화",
        555 to "불비달마",
        556 to "마라카치",
        557 to "돌살이",
        558 to "암팰리스",
        559 to "곤율랭",
        560 to "곤율거니",
        561 to "심보러",
        562 to "데스마스",
        563 to "데스니칸",
        564 to "프로토가",
        565 to "늑골라",
        566 to "아켄",
        567 to "아케오스",
        568 to "깨봉이",
        569 to "더스트나",
        570 to "조로아",
        571 to "조로아크",
        572 to "치라미",
        573 to "치라치노",
        574 to "고디탱",
        575 to "고디보미",
        576 to "고디모아젤",
        577 to "유니란",
        578 to "듀란",
        579 to "란쿨루스",
        580 to "꼬지보리",
        581 to "스완나",
        582 to "바닐프티",
        583 to "바닐리치",
        584 to "배바닐라",
        585 to "사철록",
        586 to "바라철록",
        587 to "에몽가",
        588 to "딱정곤",
        589 to "슈바르고",
        590 to "깜놀버슬",
        591 to "뽀록나",
        592 to "탱그릴",
        593 to "탱탱겔",
        594 to "맘복치",
        595 to "파쪼옥",
        596 to "전툴라",
        597 to "철시드",
        598 to "너트령",
        599 to "기어르",
        600 to "기기어르",
        601 to "기기기어르",
        602 to "저리어",
        603 to "저리릴",
        604 to "저리더프",
        605 to "리그레",
        606 to "벰크",
        607 to "불켜미",
        608 to "램프라",
        609 to "샹델라",
        610 to "터검니",
        611 to "액슨도",
        612 to "액스라이즈",
        613 to "코고미",
        614 to "툰베어",
        615 to "프리지오",
        616 to "쪼마리",
        617 to "어지리더",
        618 to "메더",
        619 to "비조푸",
        620 to "비조도",
        621 to "크리만",
        622 to "골비람",
        623 to "골루그",
        624 to "자망칼",
        625 to "절각참",
        626 to "버프론",
        627 to "수리둥보",
        628 to "워글",
        629 to "벌차이",
        630 to "버랜지나",
        631 to "앤티골",
        632 to "아이앤트",
        633 to "모노두",
        634 to "디헤드",
        635 to "삼삼드래",
        636 to "활화르바",
        637 to "불카모스",
        638 to "코바르온",
        639 to "테라키온",
        640 to "비리디온",
        641 to "토네로스",
        642 to "볼트로스",
        643 to "레시라무",
        644 to "제크로무",
        645 to "랜드로스",
        646 to "큐레무",
        647 to "케르디오",
        648 to "메로엣타",
        649 to "게노세크트",
        650 to "도치마론",
        651 to "도치보구",
        652 to "브리가론",
        653 to "푸호꼬",
        654 to "테르나",
        655 to "마폭시",
        656 to "개구마르",
        657 to "개굴반장",
        658 to "개굴닌자",
        659 to "파르빗",
        660 to "파르토",
        661 to "화살꼬빈",
        662 to "불화살빈",
        663 to "파이어로",
        664 to "분이벌레",
        665 to "분떠도리",
        666 to "비비용",
        667 to "레오꼬",
        668 to "화염레오",
        669 to "플라베베",
        670 to "플라엣테",
        671 to "플라제스",
        672 to "메이클",
        673 to "고고트",
        674 to "판짱",
        675 to "부란다",
        676 to "트리미앙",
        677 to "냐스퍼",
        678 to "냐오닉스",
        679 to "단칼빙",
        680 to "쌍검킬",
        681 to "킬가르도",
        682 to "슈쁘",
        683 to "프레프티르",
        684 to "나룸퍼프",
        685 to "나루림",
        686 to "오케이징",
        687 to "칼라마네로",
        688 to "거북손손",
        689 to "거북손데스",
        690 to "수레기",
        691 to "드래캄",
        692 to "완철포",
        693 to "블로스터",
        694 to "목도리키텔",
        695 to "일레도리자드",
        696 to "티고라스",
        697 to "견고라스",
        698 to "아마루스",
        699 to "아마루르가",
        700 to "님피아",
        701 to "루차불",
        702 to "데덴네",
        703 to "멜리시",
        704 to "미끄메라",
        705 to "미끄네일",
        706 to "미끄래곤",
        707 to "클레피",
        708 to "나목령",
        709 to "대로트",
        710 to "호바귀",
        711 to "펌킨인",
        712 to "꽁어름",
        713 to "크레베이스",
        714 to "음뱃",
        715 to "음번",
        716 to "제르네아스",
        717 to "이벨타르",
        718 to "지가르데",
        719 to "디안시",
        720 to "후파",
        721 to "볼케니온",
        722 to "나몰빼미",
        723 to "빼미스로우",
        724 to "모크나이퍼",
        725 to "냐오불",
        726 to "냐오히트",
        727 to "어흥염",
        728 to "누리공",
        729 to "키요공",
        730 to "누리레느",
        731 to "콕코구리",
        732 to "크라파",
        733 to "왕큰부리",
        734 to "영구스",
        735 to "형사구스",
        736 to "턱지충이",
        737 to "전지충이",
        738 to "투구뿌논",
        739 to "오기지게",
        740 to "모단단게",
        741 to "춤추새",
        742 to "에블리",
        743 to "에리본",
        744 to "암멍이",
        745 to "루가루암",
        746 to "약어리",
        747 to "시마사리",
        748 to "더시마사리",
        749 to "머드나기",
        750 to "만마드",
        751 to "물거미",
        752 to "깨비물거미",
        753 to "짜랑랑",
        754 to "라란티스",
        755 to "자마슈",
        756 to "마셰이드",
        757 to "야도뇽",
        758 to "염뉴트",
        759 to "포곰곰",
        760 to "이븐곰",
        761 to "달콤아",
        762 to "달무리나",
        763 to "달코퀸",
        764 to "큐아링",
        765 to "하랑우탄",
        766 to "내던숭이",
        767 to "꼬시레",
        768 to "갑주무사",
        769 to "모래꿍",
        770 to "모래성이당",
        771 to "해무기",
        772 to "널",
        773 to "실버디",
        774 to "메테노",
        775 to "자말라",
        776 to "폭거북스",
        777 to "토게데마루",
        778 to "따라큐",
        779 to "치갈기",
        780 to "할비롱",
        781 to "타타륜",
        782 to "짜랑꼬",
        783 to "짜랑고우",
        784 to "짜랑고우거",
        785 to "카푸꼬꼬꼭",
        786 to "카푸나비나",
        787 to "카푸브루루",
        788 to "카푸느지느",
        789 to "코스모그",
        790 to "코스모움",
        791 to "솔가레오",
        792 to "루나아라",
        793 to "텅비드",
        794 to "매시붕",
        795 to "페로코체",
        796 to "전수목",
        797 to "철화구야",
        798 to "종이신도",
        799 to "악식킹",
        800 to "네크로즈마",
        801 to "마기아나",
        802 to "마샤도",
        803 to "베베놈",
        804 to "아고용",
        805 to "차곡차곡",
        806 to "두파팡",
        807 to "제라오라",
        808 to "멜탄",
        809 to "멜메탈",
        810 to "흥나숭",
        811 to "채키몽",
        812 to "고릴타",
        813 to "염버니",
        814 to "래비풋",
        815 to "에이스번",
        816 to "울머기",
        817 to "누겔레온",
        818 to "인텔리레온",
        819 to "탐리스",
        820 to "요씽리스",
        821 to "파라꼬",
        822 to "파크로우",
        823 to "아머까오",
        824 to "두루지벌레",
        825 to "레돔벌레",
        826 to "이올브",
        827 to "훔처우",
        828 to "폭슬라이",
        829 to "꼬모카",
        830 to "백솜모카",
        831 to "우르",
        832 to "배우르",
        833 to "깨물부기",
        834 to "갈가부기",
        835 to "멍파치",
        836 to "펄스멍",
        837 to "탄동",
        838 to "탄차곤",
        839 to "석탄산",
        840 to "과사삭벌레",
        841 to "애프룡",
        842 to "단지래플",
        843 to "모래뱀",
        844 to "사다이사",
        845 to "윽우지",
        846 to "찌로꼬치",
        847 to "꼬치조",
        848 to "일레즌",
        849 to "스트린더",
        850 to "태우지네",
        851 to "다태우지네",
        852 to "때때무노",
        853 to "케오퍼스",
        854 to "데인차",
        855 to "포트데스",
        856 to "몸지브림",
        857 to "손지브림",
        858 to "브리무음",
        859 to "메롱꿍",
        860 to "쏘겨모",
        861 to "오롱털",
        862 to "가로막구리",
        863 to "나이킹",
        864 to "산호르곤",
        865 to "창파나이트",
        866 to "마임꽁꽁",
        867 to "데스판",
        868 to "마빌크",
        869 to "마휘핑",
        870 to "대여르",
        871 to "찌르성게",
        872 to "누니머기",
        873 to "모스노우",
        874 to "돌헨진",
        875 to "빙큐보",
        876 to "에써르",
        877 to "모르페코",
        878 to "끼리동",
        879 to "대왕끼리동",
        880 to "파치래곤",
        881 to "파치르돈",
        882 to "어래곤",
        883 to "어치르돈",
        884 to "두랄루돈",
        885 to "드라꼰",
        886 to "드래런치",
        887 to "드래펄트",
        888 to "자시안",
        889 to "자마젠타",
        890 to "무한다이노",
        891 to "치고마",
        892 to "우라오스",
        893 to "자루도",
        894 to "레지에레키",
        895 to "레지드래고",
        896 to "블리자포스",
        897 to "레이스포스",
        898 to "버드렉스",
        899 to "신비록",
        900 to "사마자르",
        901 to "다투곰",
        902 to "대쓰여너",
        903 to "포푸니크",
        904 to "장침바루",
        905 to "러브로스",
        906 to "나오하",
        907 to "나로테",
        908 to "마스카나",
        909 to "뜨아거",
        910 to "악뜨거",
        911 to "라우드본",
        912 to "꾸왁스",
        913 to "아꾸왁",
        914 to "웨이니발",
        915 to "맛보돈",
        916 to "퍼퓨돈",
        917 to "타랜툴라",
        918 to "트래피더",
        919 to "콩알뚜기",
        920 to "엑스레그",
        921 to "빠모",
        922 to "빠모트",
        923 to "빠르모트",
        924 to "두리쥐",
        925 to "파밀리쥐",
        926 to "쫀도기",
        927 to "바우첼",
        928 to "미니브",
        929 to "올리뇨",
        930 to "올리르바",
        931 to "시비꼬",
        932 to "베베솔트",
        933 to "스태솔트",
        934 to "콜로솔트",
        935 to "카르본",
        936 to "카디나르마",
        937 to "파라블레이즈",
        938 to "빈나두",
        939 to "찌리배리",
        940 to "찌리비",
        941 to "찌리비크",
        942 to "오라티프",
        943 to "마피티프",
        944 to "땃쭈르",
        945 to "태깅구르",
        946 to "그푸리",
        947 to "공푸리",
        948 to "들눈해",
        949 to "육파리",
        950 to "절벼게",
        951 to "캡싸이",
        952 to "스코빌런",
        953 to "구르데",
        954 to "베라카스",
        955 to "하느라기",
        956 to "클레스퍼트라",
        957 to "어리짱",
        958 to "벼리짱",
        959 to "두드리짱",
        960 to "바다그다",
        961 to "바닥트리오",
        962 to "떨구새",
        963 to "맨돌핀",
        964 to "돌핀맨",
        965 to "부르롱",
        966 to "부르르룸",
        967 to "모토마",
        968 to "꿈트렁",
        969 to "초롱순",
        970 to "킬라플로르",
        971 to "망망이",
        972 to "묘두기",
        973 to "꼬이밍고",
        974 to "터벅고래",
        975 to "우락고래",
        976 to "가비루사",
        977 to "어써러셔",
        978 to "싸리용",
        979 to "저승갓숭",
        980 to "토오",
        981 to "키키링",
        982 to "노고고치",
        983 to "대도각참",
        984 to "위대한엄니",
        985 to "우렁찬꼬리",
        986 to "사나운버섯",
        987 to "날개치는머리",
        988 to "땅을기는날개",
        989 to "모래털가죽",
        990 to "무쇠바퀴",
        991 to "무쇠보따리",
        992 to "무쇠손",
        993 to "무쇠머리",
        994 to "무쇠독나방",
        995 to "무쇠가시",
        996 to "드니차",
        997 to "드니꽁",
        998 to "드닐레이브",
        999 to "모으령",
        1000 to "타부자고",
        1001 to "총지엔",
        1002 to "파오젠",
        1003 to "딩루",
        1004 to "위유이",
        1005 to "고동치는달",
        1006 to "무쇠무인",
        1007 to "코라이돈",
        1008 to "미라이돈",
        1009 to "굽이치는물결",
        1010 to "무쇠잎새",
        1011 to "과미르",
        1012 to "차데스",
        1013 to "그우린차",
        1014 to "조타구",
        1015 to "이야후",
        1016 to "기로치",
        1017 to "오거폰",
    ),
) {

    fun findPokemon(id: Int): String {
        return map[id] ?: "없음"
    }

    fun findPokemon(name: String): Int {
        return map.filterValues { it == name }.keys.firstOrNull() ?: 0
    }

}