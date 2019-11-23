docker run --name consul-server -d  -v /etc/consul.d:/etc/consul.d -p 8400 -p 8500:8500 consul agent -config-file=/etc/consul.d/agent-server.json

docker run --name consul-client -d  -v /etc/consul.d:/etc/consul.d consul agent -config-file=/etc/consul.d/agent-client.json