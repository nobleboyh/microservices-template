AUTHOR: HOANGBT

//========================
THIS IS BASIC CONFIGURATION OF A MICROSERVICE PROJECT
<!-- I'M NEW WITH MICRO SERVICE ARCHITECTURE, SO ALL COMMENTS ARE WELCOME. THANK YOU-->

- DOMAIN SERVICES: SERVICE1, SERVICE2, SERVICE3, NOTIFICATION-SERVICE
- CONFIG SERVER
- DISCOVERY SERVER
- API GATEWAY
- OAUTH SERVER
- COMMON RESOURCE SERVER: MAVEN REPOSILITE
- ASYNC COMMUNICATE: SERVICE1 - KAFKA -> NOTIFICATION-SERVICE
- SYNC COMMUNICATE: SERVICE2 <---CIRCUIT BREAKER---> SERVICE2
- DATASOURCE: SERVICE1 + SERVICE2: DB1 (MYSQL), SERVICE3 DB2
- FAST COMMUNICATE: REDIS
- SCHEDULER: QUARTZ SCHEDULER

