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
        stage('Test') {
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
        stage('Push'){
            steps {
                script {
                    echo 'Push'
                }
            }            
        }
        stage('Run local'){
            steps {
                script {
                    sh 'docker run -d -p 8090:8086 example/example-app'
                }
            }            
        }

        stage('Run kuber'){
                  steps {
                      script {
                          sh 'kubectl /home/user/kuber/allinone.yaml'
                      }
                  }
              }


    }
}
