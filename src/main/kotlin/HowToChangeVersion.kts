    1. git을 활용한 버전 롤백.
git checkout ~~~~ //해시값에 해당하는 상태를 불러온다.~~~~에는 해시값이 들어간다.
git log // git한 로그를 찾는다. 여기서 날짜에 해당하는 로그를 찾고 거기에 해시값이 있다.
git switch -c ~~~~ //~~~~에는 새로운 브런치를 생성한다.
git checkout master // 원래대로 돌아가는 명령어
git commit am "My changes" // "MY changes"라는 메모를 남기며 커밋한다.
git push origin ~~~~// 아까 생성했던 브런치와 동일한 이름을 넣는다.