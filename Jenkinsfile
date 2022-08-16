pipeline {
    agent any
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
                    sh 'docker build -t example/example-app .'
                    echo 'Build Docker image'
                }
            }
        }

        stage('Login Docker') {
            steps {
              script{
                  sh 'docker login -u valeryvalavitski --password dockersenla'
            }
        }

        stage('Push image to Docker Hub')
           steps {
              script {
                 sh 'docker push example/example-app'
          }
        }

        stage('Push'){
            steps {
               script {
               echo 'Push'
                }
            }
        }

        stage('Run local stage'){
            steps {
                script {
                    sh 'docker run -d -p 8092:8086 example/example-app'
                }
            }
        }
    }
}
