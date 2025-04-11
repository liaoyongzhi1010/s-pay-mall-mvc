# 基础镜像
FROM openjdk:8-jre-slim

# 作者，使用 LABEL 代替 MAINTAINER
LABEL maintainer="lyz1010"

# 配置
ENV PARAMS=""

# 时区
ENV TZ=PRC
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

# 添加应用
ADD target/s-pay-mall-mvc-app.jar /s-pay-mall-mvc-app.jar

# 启动命令
ENTRYPOINT ["sh","-c","java -jar $JAVA_OPTS /s-pay-mall-mvc-app.jar $PARAMS"]
