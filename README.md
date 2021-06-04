# Docker, SpringBoot, and Angular
This repository is intended to build an application in Angular which
consumes multiple backend services developed in SpringBoot.
The idea is to initially configure a test environment based on a single-host
with multiple docker containers hosting the different services. 

**Country Service** - Country service is simple service which serves list of countries.
In this database is inflated using the schema.sql and data.sql and is exposed using
the controller.

**Vaccine Service** - Vaccine service is used to serve vaccinations data country wise
from the file hosted on AWS S3 bucket. In this Spring batch is being used to create 
a job that inflated the in memory db with data from Csv file hosted on S3 bucket.

**UI** - With the help of both the services and charts data is presented
in simplest manner.


## Prerequisites
- Docker Desktop
- AWS Account

## Build Steps
1. Clone repository
```bash
git clone https://github.com/ga7uti/covid-dashboard-docker-compose.git
cd covid-dashboard-docker-compose
```
2. Go to [Kaggle](https://www.kaggle.com/gpreda/covid-world-vaccination-progress) and download the covid vaccination data archive.

3. Create a bucket in AWS S3 upload the country_vaccinations file.

4. Now update the **S3 URL, AWS Accesskey** and **AWS Secret key**  in application properties file of **covid-vaccine-service**

5. Build and run docker compose
```bash
docker-compose up --build -d
```
5. Open browser on http://localhost:4200

## Disclaimer
This repositories are not intended to provide complete applications,
basically they are sandboxes and pet projects to try different technologies and
techniques.
