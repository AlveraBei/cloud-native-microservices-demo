# Cloud-Native Microservices Demo

A simple microservices project built with Spring Boot, Docker, and Kubernetes.

## Overview

This project includes two services:

- **user-service** — returns user data 
- **order-service** — returns orders and calls user-service 

The goal is to demonstrate how services communicate and scale in Kubernetes.

## Tech Stack

- Java 17 / Spring Boot 
- Docker 
- Kubernetes (Docker Desktop) 

## Architecture

    +------------------------+
    |    order-service       |
    |       (Pod)            |
    +-----------+------------+
                |
                | HTTP (Service DNS)
                ↓
    +------------------------+
    |      user-service      |
    |   (Pods x3, scaled)    |
    +------------------------+



Communication between services is handled via Kubernetes Services using internal DNS.


## Kubernetes

- Each service is deployed using a Deployment 
- Services provide stable networking 
- Internal communication via:

http://user-service/user

## Features

- Containerized with Docker 
- Deployed to Kubernetes 
- Service-to-service communication 
- Scaled using replicas 
- Built-in load balancing 

## Run locally

kubectl apply -f k8s/
kubectl port-forward service/order-service 8081:80

Open:

http://localhost:8081/orders

## Notes

Tested with Docker Desktop Kubernetes. 
Can be deployed to cloud Kubernetes (AKS / EKS / GKE).

## Key Learnings

- Deployed microservices using Kubernetes Deployments and Services 
- Enabled service-to-service communication using Kubernetes DNS 
- Scaled services using replicas and observed built-in load         balancing 
- Understood how Docker images are used as deployable artifacts 
- Set up a basic CI/CD workflow using GitHub Actions 
