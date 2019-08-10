

# Jeonju_CulturalLife
  
## 김윤서 , 정종범, 장진성, 김준성 
:book: 
### 전주공공데이터 api를 파싱한
👦 👧 👩 👨 👶 👵 👴 👱
### 전주시민 남녀 노소를 위한 앱  

## 사용 api
- 문화 체험 정보 서비스 요청url:(http://openapi.jeonju.go.kr/rest/experience/getExperienceView?authApiKey=인증키&dataSid=56810) 포맷 json+xml
- 전주시 공연문화정보 서비스 요청url:(http://openapi.jeonju.go.kr:8080/openapi/jeonju/jevent/list.do?serviceKey=인증키&요청변수=값) 포맷xml
- 문화공간 정보 서비스 요청url(http://openapi.jeonju.go.kr/rest/culture/getCultureList?authApiKey=인증키&dataValue=%EC%A0%95%EC%9D%8D%EA%B3%A0%ED%83%9D) 포맷 json+xml
- 거리투어 여행지명 검색 서비스 요청url(http://openapi.jeonju.go.kr/rest/tourstreet/getTourstreetList?authApiKey=인증키&dataValue=%EB%8F%99%EB%AC%B8) 포맷 json+xml
- 야외 여행지명검색서비스 요청url(http://openapi.jeonju.go.kr/rest/greentour/getGreentourList?authApiKey=인증키&dataValue=%EC%95%84%EC%A4%91%EC%A0%80%EC%88%98%EC%A7%80) 포맷 json+xml
- 전국 전기차 충전소 정보 서비스 요청url(http://openapi.kepco.co.kr/service/EvInfoServiceV2/getEvSearchList?addr=%EC%A0%84%EB%A0%A5%EB%A1%9C&pageNo=1&numOfRows=10&ServiceKey=서비스키) 포맷 xml

- api key는 strigs.xml에담아서 gitignore처리해주세요  
