Please add credentials file to `~/.sbt/.credentials` path.

```properties
realm=Repsy Managed Repository
host=repo.repsy.io
user=fixme
password=fixme
```

then also fix the section in build.sbt file:

```sbt
publishTo := Some("repsy" at "https://repo.repsy.io/mvn/MY_USERNAME/MY_REPO")
```
