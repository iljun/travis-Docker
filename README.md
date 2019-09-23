# travis-Docker

Travis CI를 이용해 Docker image build 후 Docker Repository에 push

## Step
- Local에서 작업 후 git으로 push
- git Master Branch에 push가 일어날 경우 Travis CI에서 해당 결과물을 빌드
- 빌드 성공 시 Docker image 생성 후 docker repository로 push
- docker repository에 push 후 deploy를 이용해 배포

## TODO LIST
- 서비스를 위한 Docker 설정
- docker hub push 이후 container image update
- 서비스하기 위한 properties 관리 방법 (application.properties)
- aws의 경우 code deploy를 이용하면 noti를 이용한 image update가 가능할것으로 생각
- azure의 경우 deployment center를 이용하면 될것같음
- 가장 단순한 방법은 travis ci 빌드 이후 실제 VM에 접속해 docker image pull 이후 container run하는 script를 실행
- 위 방법은 너무 원초적인 방법, 여러개의 VM이 떠있으면 계속 script가 변경되어야 한다.
- 또한 auto scaling에 대처하지 못한다.
- aws codeDeploy를 이용해본 다음 azure도 적용해봐야겠다.