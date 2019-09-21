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