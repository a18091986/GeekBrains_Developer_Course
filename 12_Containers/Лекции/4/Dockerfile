FROM ubuntu:22.10
RUN apt-get update && apt-get -y upgrade \
    && apt-get install -y cowsay && ln -s /usr/games/cowsay /usr/bin/cowsay
CMD ["cowsay"]
