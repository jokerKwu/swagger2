# RESTful API란?
RESTful API라는 단어에서 사용되는 REST의 개념을 한줄로 정의하자면 아래와 같이 정의한다.<br>
HTTP 통신에서 어떤 자원에 대한 CRUD 요청을 Resource와 Method로 표현하여 특정한 형태로 전달하는 방식<br>

즉, REST란 어떤 자원에 대해 CRUD 연산을 수행하기 위한 URI로 요청을 보내는 것으로<br>
GET, POST 등의 방식을 사용하여 요청을 보내며, 요청을 위한 자원은 특정한 형태로 표현된다.<br>
그리고 이러한 REST 기반의 API를 웹으로 구현한 것이 RESTful API이다.<br>
웹 상에 CRUD 연산에 대한 요청을 할 때<br>
요청을 위한 자원(URI)와 이에 대한 Method(행위) 그리고 표현(자원의 형태)을 사용하면 표현이 명확해지므로 이를 REST라 하며, <br>
이러한 규칙을 지켜서 설계된 API를 REST API또는 RESTful API라고 한다.<br>

# RESTful API의 구성요소

- Resource
 서버는 Unique한 ID를 가지는 Resource를 가지고 있으며, 클라이언트는 이러한 Resource에 요청을 보낸다.<br>
 이러한 Resource는 URI에 해당된다.<br>
 
- Method
서버에 요청을 보내기 위한 방식으로 GET, POST, PUT, PATCH, DELETE가 있다.<br>
CRUD 연산 중에서 처리를 위한 연산에 맞는 Method를 사용하여 서버에 요청을 보내야 한다.<br>

- Representation of Resource
 클라이언트와 서버가 데이터를 주고받는 형태로 json, xml, text, rss 등이 있다.<br> 
 최근에는 Key, Value를 활용하는 json을 주로 사용한다.<br>
 

## URL와 URI의 차이점은?
URL은 Uniform Resource Locator로 인터넷 상 자원의 위치를 의미한다.<br>
자원의 위치라는 것은 결국 어떤 파일의 위치를 의미한다.<br>
반면에 URI는 Uniform Resource Identifier로 인터넷 상의 자원을 식별하기 위한 문자열의 구성으로,<br>
URI는 URL를 포함하게 된다. 그러므로 URI가 보다 포괄적인 범위라고 할 수 있다.<br>

## REST의 특징
  1. Uniform Interface(일관된 인터페이스)
Uniform Interface란 Resource(URI)에 대한 요청을 통일되고, 한정적으로 수행하는 아키텍처 스타일을 의미합니다.<br>
이것은 요청을 하는 Client가 플랫폼(Android, Ios, Jsp 등) 에 무관하며, 특정 언어나 기술에 종속받지 않는 특징을 의미합니다. <br>
이러한 특징 덕분에 Rest API는 HTTP를 사용하는 모든 플랫폼에서 요청가능하며, Loosely Coupling(느슨한 결함) 형태를 갖게 되었습니다. <br>
 
  2. Stateless(무상태성)
서버는 각각의 요청을 별개의 것으로 인식하고 처리해야하며, 이전 요청이 다음 요청에 연관되어서는 안됩니다.<br>
그래서 Rest API는 세션정보나 쿠키정보를 활용하여 작업을 위한 상태정보를 저장 및 관리하지 않습니다.<br>
이러한 무상태성때문에 Rest API는 서비스의 자유도가 높으며, 서버에서 불필요한 정보를 관리하지 않으므로 구현이 단순합니다.<br>
이러한 무상태성은 서버의 처리방식에 일관성을 부여하고, 서버의 부담을 줄이기 위함입니다.<br>
 

  3. Cacheable(캐시 가능)
Rest API는 결국 HTTP라는 기존의 웹표준을 그대로 사용하기 때문에, 웹의 기존 인프라를 그대로 활용할 수 있습니다.<br>
그러므로 Rest API에서도 캐싱 기능을 적용할 수 있는데, HTTP 프로토콜 표준에서 사용하는 Last-Modified Tag 또는 E-Tag를 이용하여 캐싱을 구현할 수 있고,<br>
이것은 대량의 요청을 효울척으로 처리할 수 있게 도와줍니다.<br>
 

  4. Client-Server Architecture (서버-클라이언트 구조)
Rest API에서 자원을 가지고 있는 쪽이 서버, 자원을 요청하는 쪽이 클라이언트에 해당합니다.<br>
서버는 API를 제공하며, 클라이언트는 사용자 인증, Context(세션, 로그인 정보) 등을 직접 관리하는 등 역할을 확실히 구분시킴으로써 서로 간의 의존성을 줄입니다.<br>
 

  5. Self-Descriptiveness(자체 표현)
Rest API는 요청 메세지만 보고도 이를 쉽게 이해할 수 있는 자체 표현 구조로 되어있습니다.<br>
아래와 같은 JSON 형태의 Rest 메세지는 http://localhost:8080/board 로 게시글의 제목, 내용을 전달하고 있음을 손쉽게 이해할 수 있습니다.<br>
또한 board라는 데이터를 추가(POST)하는 요청임을 파악할 수 있습니다.<br>

<pre><code>
HTTP POST , http://localhost:8080/board
  {
  "board":{
  "title":"제목",
  "content":"내용"
  }
}
</code></pre>
  6. Layered System(계층 구조)
Rest API의 서버는 다중 계층으로 구성될 수 있으며 보안, 로드 밸런싱, 암호화 등을 위한 계층을 추가하여 구조를 변경할 수 있습니다.<br>
또한 Proxy, Gateway와 같은 네트워크 기반의 중간매체를 사용할 수 있게 해줍니다.<br>
하지만 클라이언트는 서버와 직접 통신하는지, 중간 서버와 통신하는지 알 수 없습니다.<br>

