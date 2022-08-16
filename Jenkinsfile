pipeline {
    agent any
    
    environment {
        dockerhub=credentials('dockerhub')
    } 
    
    stages {
        
        stage('Build') {
            steps {
                script {
                    echo 'Build'
                    sh 'mvn compile'
                }
            }
        }
        
        stage('Test stage') {
            steps {
                script {
                    echo 'Test'
                    sh 'mvn test'
                }
            }
        }
        
        stage('Package') {
            steps {
                script {
                    sh 'mvn package -Dmaven.test.skip'
                    echo 'Package'
                }
            }
        }
        
        stage('Build Docker image') {
            steps {
                script {
                    sh 'docker build -t app:v1 .'
                    echo 'Build Docker image'
                }
            }
        }
        
        stage('Deploy Docker Login') {
            steps {
                script {        
                    sh 'echo $dockerhub_PSW | docker login -u $dockerhub_USR --password-stdin'
                }
            }
        }   
        
        stage('Deploy Docker PUSH') {
            steps {
                script { 
                    sh 'docker tag app:v1 valeryvalavitski/casaccaac'
                    sh 'docker push valeryvalavitski/casaccaac'
                }
            }
        }    
    }
}
