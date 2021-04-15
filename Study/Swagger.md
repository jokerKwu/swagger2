# Swagger란?

스웨거는 Open Api Specification(OAS)를 위한 프레임워크로 대표적인 API 관리 도구이다. <br>
API들이 가지고 있는 스펙(spec)을 명세, 관리한다. <br>
SpringBoot에서 Swagger를 사용하면, Controller(컨트롤러)에 명시된 Annotation을 해석하여 API 문서를 자동으로 생성한다.<br>
Swagger에서 만들어주는 docs 페이지를 통해 Postman에서 진행했던 테스트가 가능하다.<br>
백엔드와 프론트엔드 프로그램 사이에서 정확히 어떠한 방식으로 데이터 구조를 받을 지에 대한 명세가 필요할 수 있다.<br>
이러한 내용이 담긴 문서를 일반적으로 API 명세서라고 한다.<br>
개발 상황의 변환에 따른 API의 추가 or 변경할 때마다 문서에 적용하는 불편함을 해결하기 위해 Swagger를 사용한다.<br>


# Swagger의 5가지 기능
1. API 디자인
Swagger-editor를 통해 api를 문서화하고 빠르게 명세할 수 있다.

2. API Development
Swagger-codegen을 통해 작성된 문서를 통해 SDK를 생성하여 빌드 프로세스를 간소화 할 수 있도록 도와준다.<br>
문서를 통해 실행하면 프로토 타입 코드를 생성해주는데 파일 구조가 정해져있는 것 같다.<br>

3. API Documentation
Swagger-UI를 통해 작성은 API를 시각화시켜 준다.

4. API Testing
Swagger-Inspector를 통해 API를 시각화하고 빠른 테스팅을 진행할 수 있다.

5. Standardize
Swagger-hub를 통해 개인, 팀원들이 API 정보를 공유하는 Hub이다.


# Swagger의 장, 단점

### 장점
- API를 테스트 해 볼수 있는 화면을 제공한다.<br>
- 적용하기 쉽다.<br>

### 단점
- 제품코드에 어노테이션 추가해야한다.<br>
- 제품코드와 동기화가 안될수 있다.<br>
- 실제 코드에 영향을 미치지 않지만 지속해서 추가됨으로써 실제 코드보다 문서 명세에 대한 코드가 더 길어져 전체적인 가독성이 떨어진다.<br>
- 해당 코드는 주석일뿐 로직에 영향을 미치지 않기 때문에 비즈니스 로직이 변경되더라도 문서를 갱신하지 않아 결국 문서와 코드가 일치하지 않게 된다.<br>
- 정상적인 Response에 대한 명세 일뿐 status 2xx 이욍의 값에 대한 정의가 힘들다. 이것을 정의하더라도 주석 형태로 정의하게 되어 결국 시간이 지나면 문서와 코드가 일치하지 않게 된다.<br>
