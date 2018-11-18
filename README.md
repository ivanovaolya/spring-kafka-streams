# spring-kafka-streams
Pet project for reading events from Kafka streams using Validation API

### Quickstart for Apache Kafka (Mac)
1. Install the latest version of [Apache Kafka](https://kafka.apache.org/downloads) using Brew package manager
```sh
brew install kafka
```
2. Start Apache ZooKeeper server
```sh
brew services start zookeeper
```
3. Start the Kafka server
```sh
brew services start kafka
```
### Run the app
```sh
./gradlew bootRun
```
### Testing the app
```sh
curl -d '{"code": "0902341", "description": "Simple description"}' \ 
  > -H "Content-Type: application/json" -X POST http://localhost:8080/products
```
