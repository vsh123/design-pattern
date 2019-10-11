## pull 옵저버 패턴

### 날씨 옵저버는 다음과 같은 기능을 가지고 있다.

- Subject를 받아 필요한 정보를 업데이트할 수 있다.

#### 다음과 같은 신문 구독자들이 존재한다

- Hyelin : 날씨와, 온도, 풍속을 가지고 있다
- Sunyoung : 온도, 풍속을 가지고 있다.
- SunHo : 날씨를 가지고 있다.

### Subject(WeatherSubject)는 다음과 같은 기능을 가지고 있다

- 구독자 등록/취소 기능
- 구독자에게 업데이트 정보를 알림하는 기능
- 새로운 컨텐츠를 업데이트하는 기능
- 날씨, 온도, 풍속을 리턴해주는 기능

이 때 주어진 인터페이스를 이용하여 옵저버 패턴을 구현한다.
이에 대한 검증은 PullTest를 모두 구현하여 통과하는 것으로 한다.