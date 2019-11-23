docker pull consul

docker run --name consul-server -d  -v /home/jianghuiyao/data/git/labs-mesh/consul:/etc/consul.d -p 8400 -p 8500:8500 consul agent -config-file=/etc/consul.d/agent-server.json

docker run --name web -d  -v /home/jianghuiyao/data/git/labs-mesh/consul:/consul/config -p 8080:8080 xpanda/consul