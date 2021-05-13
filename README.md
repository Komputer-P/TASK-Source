# TASK
Task: Time/Task Management Service
태스크: 일정/시간 관리 서비스

# Features
+ Daily Do 서비스
    + 오늘 할 일 관리 기능
    + 설정 - 요일별 할 일 추가 기능 (자동으로 해당 요일에 할 일이 추가됨)
    + 다크 모드
+ Pomodoro 서비스
    + 타이머 기능
    + 오늘 달성한 포모
    + 다크 모드    
+ Dashboard 서비스

# Tech Stacks
+ 서버
    + REST API
    + Java
    + Spring Boot
+ 웹 클라이언트
    + HTML5/CSS3
    + JavaScript (ES6)
    + React.js (Hooks)
    + Webpack, Babel
    + React Router
    
# Updates
+ 2021-05-13
    + 대시보드 서비스
        + 웹 클라이언트
            + 서버와 API 통신 테스트 완료 (따로 서버에 관련 API 추가하지 않고, 서버에서 가져온 데이터를 클라이언트에서 처리하여 정보 표시)
            + 대시보드 프로토타입 탭 추가 (오늘 할 일 달성률, 오늘 한 뽀모 등 관련 정보 표시) 완료
            + 기본 CSS 디자인 적용 완료
+ 2021-05-11
    + Pomodoro 서비스
        + 서버
            + 포모 업데이트 기능 추가
        + 웹 클라이언트
            + 기본 Pomodoro 컴포넌트 프로토타입 개발 3단계 (오늘 한 포모 자동 업데이트 및 서버에 저장 기능 완성)
+ 2021-05-10
    + Pomodoro 서비스
        + 웹 클라이언트
            + 설정 탭에 다크 모드 설정 기능 추가 완료
            + 기존 'Pomodoro' 서비스의 CSS 디자인을 적용 완료
+ 2021-05-09
    + Pomodoro 서비스
        + 서버
            + Pomodoro 서비스 프로토타입 API 개발 완료 (설정 타이머, 포모 저장 기능, 임시적으로 단일 리파지토리로 개발)
        + 웹 클라이언트
            + 기본 Pomodoro 컴포넌트 프로토타입 개발 2단계+ (서버 API와 통신 및 타이머 설정 기능 완성)
            + 타이머가 작동하고 있는 도중에 설정 탭으로 이동 시 언마운트된 탭(타이머 탭)에서 상태값들의 메모리 누수가 발생하는 문제 해결 (useEffect cleanUp)
+ 2021-05-08
    + Pomodoro 서비스
        + 웹 클라이언트
            + 기본 Pomodoro 컴포넌트 프로토타입 개발 2단계 (설정 - 타이머 세팅 기능) 템플릿 완료
            + 고정 요소 (네비게이션, Footer) + React Router 적용 완료 (타이머, 설정 탭)
            + 일부 컴포넌트에 CSS 적용 완료 (Daily Do 서비스와 동일한 스타일 적용)
+ 2021-05-07
    + Pomodoro 서비스
        + 웹 클라이언트
            + 기본 Pomodoro 컴포넌트 프로토타입 개발 1단계 (타이머 기능, 일일 포모 카운트 기능) 완료
+ 2021-05-04
    + Daily Do 서비스
        + 웹 클라이언트
            + React Router를 이용하여 주소에 따라 다른 컴포넌트가 화면에 나타나도록 변경
            + CSS, JS 파일 정리 및 일부분 리팩토링 완료
+ 2021-05-03
    + Daily Do 서비스
        + 웹 클라이언트
            + 설정에서 Light-Dark 테마 설정 기능 추가 (추후 styled-components를 활용하여 리팩토링할 예정)
+ 2021-05-01
    + Daily Do 서비스
        + 웹 클라이언트
            + 기존 'Daily Do' 서비스의 CSS 디자인을 적용 완료
+ 2021-04-30
    + Daily Do 서비스
        + 웹 클라이언트
            + 상단 네비게이션 컴포넌트 개발, 네비게이션에 따라 메인 페이지의 내용이 전환되게 수정
            + '요일 별 할 일 설정' 로드 시 목록을 2번씩 가져오는 문제 해결
+ 2021-04-29
    + Daily Do 서비스
        + 서버
            + '오늘 할 일'에 오늘 요일에 해당하는 '요일별 할 일' 목록 갱신 기능에서, 요일별 할 일을 제대로 필터링하지 못하는 문제 해결
        + 웹 클라이언트
            + 컴포넌트 프로토타입 개발 3단계 (요일별 할 일 설정 기능) 개발 완료
+ 2021-04-28
    + Daily Do 서비스
        + 서버
            + '요일별 할 일' 목록 API 개발 (요일별 목록 CRUD 기능) 완료
            + '오늘 할 일'에 오늘 요일에 해당하는 '요일별 할 일' 목록 갱신 기능 개발 완료
+ 2021-04-27
    + Daily Do 서비스
        + 서버
            + Java 파일 및 클래스, 변수, 함수들의 이름 변경 (Task -> Todo)
        + 웹 클라이언트
            + 컴포넌트 프로토타입 개발 2단계 (할 일 수정, 체크, 서버 API와 통신) 완료
+ 2021-04-26
    + Daily Do 서비스
        + 웹 클라이언트
            + Daily Do 서비스 - 컴포넌트 프로토타입 개발 1단계 (할 일 생성, 읽기, 삭제 기능) 완료
+ 2021-04-25
    + Daily Do 서비스
        + 서버
            + Daily Do 서비스 - '오늘 할 일' 프로토타입 API 개발 완료
        + 웹 클라이언트
            + Daily Do 서비스 - '오늘 할 일' 프로토타입 API 와 통신 테스트 완료 (정상작동)

# TO-DO
+ 메인 서비스
    + 서버
        + 로그인 기능 추가 (Auth2)
+ 대시보드 서비스
    + 서버
    + 웹 클라이언트
        + 설정 탭: 대시보드의 나오는 각종 정보 보여주기/숨기기 기능 + 다크 모드 기능
        + 프론트(로그인) 프로토타입 페이지         
+ Daily Do 서비스
    + 서버
    + 웹 클라이언트
+ Pomodoro 서비스
    + 서버
    + 웹 클라이언트
+ 기타
    + Daily Do 서비스 웹 클라이언트: 리액트 컴포넌트, 코드 리팩토링

# Issues
+ CORS Policy
    + Port Issue: Cross Origin 3000 -> 8080
    + Pomodoro 서비스: 탭 전환 시 간헐적으로 메모리 누수와 함께 제대로 cleanUp이 되지 않는 문제