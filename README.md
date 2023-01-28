# TASK

> Version 2.0 개발 예정. 기존 TASK 리포지토리들은 Public Archieved될 예정입니다.

태스크: 매일 쉽고 간단하게 활용할 수 있는 일정/시간 관리 웹 서비스

# Features

- 오늘 할 일 서비스
  - 오늘 할 일 관리 기능
  - 설정 - 요일별 할 일 추가 기능 (자동으로 해당 요일에 할 일이 추가됨)
  - 다크 모드 기능
- 뽀모도로 서비스
  - 타이머 기능
  - 오늘 달성한 포모 표시 기능
  - 다크 모드 기능
- 태스크(메인/대시보드) 서비스
  - 오늘 할 일 / 뽀모도로 관련 정보 표시 기능
  - 자동 로그인 기능
  - 다크 모드 기능

# Tech Stacks

- 서버
  - REST API
  - Java
  - Spring Boot
  - AWS EC2, RDS
- 웹 클라이언트
  - HTML5/CSS3
  - JavaScript (ES6)
  - React.js (Hooks), React Router
  - Webpack, Babel

# Updates

- 2023-01-28
  - 태스크
    - 기존 Google 로그인 플랫폼 라이브러리에서 최신 Google ID 서비스 라이브러리로 이전
      - 참고: https://developers.google.com/identity/gsi/web/guides/migration?hl=ko

<details><summary>지난 업데이트 보기</summary>
<p>
+ 2022-07-09
    + 태스크
        + TASK Version 1.0, Electron 기반 Mac & Windows 데스크탑 앱으로 포팅 완료

- 2022-07-08

  - 태스크
    - 웹사이트 도메인 주소 변경 (http://www.task.link)
    - TASK API 서버 이전 (AWS -> Synology)

- 2021-12-13

  - 태스크
    - 공통: 웹사이트 로딩 화면 구현 (로딩 화면에서 자동 로그인 수행)

- 2021-12-12

  - 태스크
    - 공통: 웹사이트 자동 로그인 기능 구현

- 2021-06-28

  - 태스크
    - 공통: 웹사이트에 Google Analytics 추가

- 2021-06-23

  - 태스크
    - 공통: config.js 파일로 웹사이트 URL, 서버 URL를 한 곳에 관리하도록 리팩토링

- 2021-06-11 - Website Update

  - 태스크
    - 공통: 태스크 홈페이지 주소 변경 (http://tasko.today)

- 2021-05-31 - Version 1.0 Release

  - 태스크
    - 웹 클라이언트
      - 공통: 네비게이션 바의 사용자 아이콘을 클릭하면 로그아웃 할 수 있는 버튼 추가 및 기존 로그아웃 로직 변경
      - 대시보드 서비스: 사용자 프로필 옆에 새로운 정보를 가져오는 Refresh 버튼 추가
      - 뽀모도로: 설정의 일부 CSS 변경

- 2021-05-30

  - 태스크
    - 서버
      - 서버 API가 더이상 구글 발급 토큰이 아닌, 자체 사용자ID를 통해 API 통신하도록 변경 (REST 컨트롤러, 서비스 등 대부분의 로직 변경)
    - 웹 클라이언트
      - 공통: 사용자ID를 쿠키로 계속 로그인이 유지되도록 변경 (1시간 뒤 로그아웃되어 뽀모도로의 뽀모가 업데이트가 되지 않는 문제 등을 해결)

- 2021-05-29

  - 태스크
    - 서버
      - Nginx + 무중단 배포 스크립트를 통한 무중단 배포 환경 구축 완료
    - 웹 클라이언트
      - 공통: 무중단 배포 환경 구축 - Nginx 사용에 따라 패치 로직에서 API 서버 포트를 없앰 (기본포트 80번)
      - (테스트 중...) ~~대시보드 서비스: 로그인 시 대시보드에 그 전날의 정보가 서버에서 가져와지는 문제 해결 (로그인 시 유저와 관련 정보가 모두 업데이트 된 뒤에 Todo와 Pomdoro 아이템을 가져오도록 로직을 수정함)~~

- 2021-05-28

  - 태스크
    - 서버
      - TASK-Server 리파지토리에 서버가 업데이트되어 깃허브에 push되면 자동으로 배포되도록 구축 완료 (Travis CI -> AWS S3 -> AWS CodeDeploy -> AWS EC2)

- 2021-05-27

  - 태스크(메인/대시보드) 서비스, 오늘 할 일 서비스, 뽀모도로 서비스
    - 서버
      - 재 로그인 시 유저 정보가 초기화되어 오늘 할 일에 작성한 할 일 목록과 뽀모 카운트 모두 초기화되는 문제 해결
    - 웹 클라이언트
      - 공통: 로고 아이콘을 누르면 대시보드, 포트폴리오 페이지로 이동하도록 수정
      - 대시보드: 오늘 할 일 서비스, 뽀모도로 서비스 아이콘 추가 및 일부 CSS 조정

- 2021-05-26

  - 오늘 할 일 서비스
    - 웹 클라이언트
      - 공통: 할 일 목록의 내용이 길어도 잘 보이도록 수정
      - 요일별 할 일 설정: 새로운 할 일을 추가할 때 추가한 할 일이 간헐적으로 추가되지 않거나 느린 텀을 두고 추가되는 문제를 해결

- 2021-05-25

  - 태스크(메인/대시보드) 서비스, 오늘 할 일 서비스, 뽀모도로 서비스
    - 서버
      - DB: 뽀모도로 DB 수정 및 관련 서비스, API, DTO 수정 완료
      - 버그: todayFetch 함수에서 오늘 할 일 서비스의 갱신 시간만으로 오늘 할 일 서비스, 뽀모도로 서비스 둘 다 업데이트하던 문제 해결
    - 웹 클라이언트
      - 대시보드: 지금까지 한 총 뽀모 표시 기능 추가
      - 모든 서비스: 로그인 후 1시간이 지난 뒤 특정 작업을 수행하려고 하면 자동으로 로그아웃되고 로그인 페이지로 이동하는 기능 구현 (구글 토큰 유효기간: 1시간)
      - 버그
        - 대시보드 서비스: 로그아웃 버튼을 눌러도 제대로 로그아웃되어 로그인 페이지로 이동하지 않던 문제 해결
        - 뽀모도로 서비스:
          - 타이머가 끝나고 다시 타이머 시작 버튼이 다시 활성화 되지 않던 문제 해결
          - 타이머가 끝나고 다시 초기 상태로 돌아갈 때, 초 단위 표시가 제대로 표시되지 않던 문제 해결

- 2021-05-24

  - 오늘 할 일 서비스, 뽀모도로 서비스
    - 서버
      - 다음날 오전 6시 이후에 뽀모도로 서비스에 접속하면 어제 했던 뽀모 초기화 및 최고 뽀모 기록 갱신 기능 구현
      - 다음날 오전 6시 이후에 오늘 할 일 서비스에 접속하면 어제 한 할 일 리스트 삭제 및 설정한 오늘 요일에 해당하는 할 일 리스트로 갱신하는 기능 구현

- 2021-05-23 - 서비스 시작

  - 태스크(메인/대시보드) 서비스, 오늘 할 일 서비스, 뽀모도로 서비스
    - 서버
      - 태스크(메인/대시보드) 서비스, 오늘 할 일 서비스, 뽀모도로 서비스의 모든 기능 정상 작동 확인 완료
    - 웹 클라이언트
      - 페이지를 리로딩하면 404 에러가 뜨는 문제를 해결 (HashRouter)
      - 오늘 할 일 서비스에서 요일을 서로 다르게 저장하고 사용하고 있었던 문제를 해결

- 2021-05-22

  - 태스크(메인/대시보드) 서비스, 오늘 할 일 서비스, 뽀모도로 서비스
    - 서버
      - AWS EC2 서버 환경 구축, RDS 데이베이스 구축 및 EC2-RDS 연결
      - EC2 서버 환경에 배포 스크립트 생성 완료 (깃허브 Pull 후 Build)
      - 서버 정상 실행 확인 완료
    - 웹 클라이언트
      - Fetch API 주소를 AWS EC2 서버 주소로 수정

- 2021-05-21

  - 태스크(메인/대시보드) 서비스, 오늘 할 일 서비스, 뽀모도로 서비스
    - 웹 클라이언트
      - 구글 로그인 토큰 값을 localstorage가 아닌 cookie에 저장하고 참조하도록 변경
      - 모바일 환경에 맞게 일부 CSS 변경

- 2021-05-20

  - 태스크(메인/대시보드) 서비스
    - 웹 클라이언트
      - 상단 네비게이션 바에 로그인된 사용자 표시 기능 추가
      - 네비게이션 바의 사용자 아이콘을 누르면 로그아웃 드롭다운이 나타나고, 로그아웃을 누르면 현재 사용자에서 로그아웃할 수 있는 기능 추가
  - 오늘 할 일 서비스, 뽀모도로 서비스
    - 클라이언트
      - 상단 네비게이션 바에 로그인된 사용자 표시 기능 추가

- 2021-05-17 - 프로토타입 완성

  - 태스크(메인/대시보드) 서비스
    - 웹 클라이언트
      - 로그아웃 기능 구현 완료
  - 오늘 할 일 서비스
    - 서버
      - 기존 DB (JPA)에 사용자 ID 필드를 추가, 변경에 따른 API도 수정 완료
    - 클라이언트
      - 서버 API와 통신하는 로직 수정 (로그인 토큰으로 서버 API와 통신)

- 2021-05-16
  - 태스크(메인/대시보드) 서비스
    - 웹 클라이언트
      - 대시보드 탭에서 사용자에 따른 뽀모도로 정보를 표시하도록 서버 API와 통신하는 로직 수정
      - 뽀모도로 관련 정보에 '나의 집중력' (시간) 항목 추가 완료
  - 뽀모도로
    - 서버
      - 사용자별 뽀모도로 DB (JPA)로 전환 완료, 전환에 따른 API도 수정 완료
    - 클라이언트
      - 서버 API와 통신하는 로직 수정 (로그인 토큰으로 서버 API와 통신)
- 2021-05-15

  - 태스크(메인/대시보드) 서비스
    - 서버
      - 로그인 API 구현 완료 (Google OAuth 로그인, 토큰 검증 후 Google 서버에서 사용자 정보를 가져와서 User 리파지토리에 저장/수정 후 해당 정보 클라이언트로 전송)
      - 버그: 로그아웃 후 다시 로그인하면 사용자 관련 뽀모도로 데이터가 모두 리셋되는 문제 해결 (Optional orElse -> Optioanl orElseGet으로 수정함)
    - 웹 클라이언트
      - 로그인 페이지 추가 완료, Google 로그인 추가 완료
      - 서버 API와 통신하는 로직 수정 (로그인 토큰으로 사용자별 데이터를 가져옴)
      - CSS 일부 수정 ( 일부 CSS 통합, 뷰포트에 따른 상단 CSS margin 조정)

- 2021-05-14

  - 태스크(메인/대시보드) 서비스
    - 웹 클라이언트
      - 기본 CSS 디자인 적용 완료
      - 설정 탭에 다크 모드 기능 추가
  - 오늘 할 일, 뽀모도로 서비스
    - CSS 수정, 설정의 다크 모드 토글 변경 및 설명글 수정

- 2021-05-13

  - 태스크(메인/대시보드) 서비스
    - 웹 클라이언트
      - 서버와 API 통신 테스트 완료 (따로 서버에 관련 API 추가하지 않고, 서버에서 가져온 데이터를 클라이언트에서 처리하여 정보 표시)
      - 대시보드 탭 추가 (오늘 할 일 달성률, 오늘 한 뽀모 등 관련 정보 표시) 완료

- 2021-05-11

  - 뽀모도로 서비스
    - 서버
      - 포모 업데이트 기능 추가
    - 웹 클라이언트
      - 기본 뽀모도로 컴포넌트 프로토타입 개발 3단계 (오늘 한 포모 자동 업데이트 및 서버에 저장 기능 완성)

- 2021-05-10

  - 뽀모도로 서비스
    - 웹 클라이언트
      - 설정 탭에 다크 모드 설정 기능 추가 완료
      - 기존 'Pomodoro' 서비스의 CSS 디자인을 적용 완료

- 2021-05-09

  - 뽀모도로 서비스
    - 서버
      - 뽀모도로 서비스 프로토타입 API 개발 완료 (설정 타이머, 포모 저장 기능, 임시적으로 단일 리파지토리로 개발)
    - 웹 클라이언트
      - 기본 뽀모도로 컴포넌트 프로토타입 개발 2단계+ (서버 API와 통신 및 타이머 설정 기능 완성)
      - 타이머가 작동하고 있는 도중에 설정 탭으로 이동 시 언마운트된 탭(타이머 탭)에서 상태값들의 메모리 누수가 발생하는 문제 해결 (useEffect cleanUp)

- 2021-05-08

  - 뽀모도로 서비스
    - 웹 클라이언트
      - 기본 뽀모도로 컴포넌트 프로토타입 개발 2단계 (설정 - 타이머 세팅 기능) 템플릿 완료
      - 고정 요소 (네비게이션, Footer) + React Router 적용 완료 (타이머, 설정 탭)
      - 일부 컴포넌트에 CSS 적용 완료 (Daily Do 서비스와 동일한 스타일 적용)

- 2021-05-07

  - 뽀모도로 서비스
    - 웹 클라이언트
      - 기본 뽀모도로 컴포넌트 프로토타입 개발 1단계 (타이머 기능, 일일 포모 카운트 기능) 완료

- 2021-05-04

  - 오늘 할 일 서비스
    - 웹 클라이언트
      - React Router를 이용하여 주소에 따라 다른 컴포넌트가 화면에 나타나도록 변경
      - CSS, JS 파일 정리 및 일부분 리팩토링 완료

- 2021-05-03

  - 오늘 할 일 서비스
    - 웹 클라이언트
      - 설정에서 Light-Dark 테마 설정 기능 추가 (추후 styled-components를 활용하여 리팩토링할 예정)

- 2021-05-01

  - 오늘 할 일 서비스
    - 웹 클라이언트
      - 기존 'Daily Do' 서비스의 CSS 디자인을 적용 완료

- 2021-04-30

  - 오늘 할 일 서비스
    - 웹 클라이언트
      - 상단 네비게이션 컴포넌트 개발, 네비게이션에 따라 메인 페이지의 내용이 전환되게 수정
      - '요일 별 할 일 설정' 로드 시 목록을 2번씩 가져오는 문제 해결

- 2021-04-29

  - 오늘 할 일 서비스
    - 서버
      - '오늘 할 일'에 오늘 요일에 해당하는 '요일별 할 일' 목록 갱신 기능에서, 요일별 할 일을 제대로 필터링하지 못하는 문제 해결
    - 웹 클라이언트
      - 컴포넌트 프로토타입 개발 3단계 (요일별 할 일 설정 기능) 개발 완료

- 2021-04-28

  - 오늘 할 일 서비스
    - 서버
      - '요일별 할 일' 목록 API 개발 (요일별 목록 CRUD 기능) 완료
      - '오늘 할 일'에 오늘 요일에 해당하는 '요일별 할 일' 목록 갱신 기능 개발 완료

- 2021-04-27

  - 오늘 할 일 서비스
    - 서버
      - Java 파일 및 클래스, 변수, 함수들의 이름 변경 (Task -> Todo)
    - 웹 클라이언트
      - 컴포넌트 프로토타입 개발 2단계 (할 일 수정, 체크, 서버 API와 통신) 완료

- 2021-04-26
  - 오늘 할 일 서비스
    - 웹 클라이언트
      - 컴포넌트 프로토타입 개발 1단계 (할 일 생성, 읽기, 삭제 기능) 완료
- 2021-04-25 + 오늘 할 일 서비스 + 서버 + '오늘 할 일' 프로토타입 API 개발 완료 + 웹 클라이언트 + '오늘 할 일' 프로토타입 API 와 통신 테스트 완료 (정상작동)
</p>
</details>

# TO-DO

- 태스크(메인/대시보드) 서비스
  - 서버
    - API 리팩토링
  - 웹 클라이언트
    - CDN (클라우드플레어) 등으로 웹사이트 운영
    - 컴포넌트 리팩토링
- Daily Do 서비스
  - 서버
    - API 리팩토링
  - 웹 클라이언트
    - 컴포넌트 리팩토링
- Pomodoro 서비스
  - 서버
    - API 리팩토링
  - 웹 클라이언트
    - 컴포넌트 리팩토링
- Memo 서비스
  - 메모 기능 추가 (Google Keep API와 연동)

# Issues

- ~~CORS Policy로 API 서버와 통신을 제대로 하지 못하는 문제~~
  - Cross Origin 3000 -> 8080
- ~~MariaDB Lock 관련 문제: Lock wait timeout exceed, pessimistic lock...~~
  - Transaction 처리 문제, 서비스 단에서 DB에 CRUD를 하는 서비스 각각에 @Transactional 어노테이션 추가로 Transaction Locking 해결
- Pomodoro 서비스: 탭 전환 시 간헐적으로 메모리 누수와 함께 제대로 cleanUp이 되지 않는 문제
- React Warnings: useEffect dependencies에 추가 여부에 관한 문제
