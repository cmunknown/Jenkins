pipeline {
    agent any
    
    
    stages {  
         stage('Build') {
            steps {
                script {
                    echo 'Build'
                    bat 'mvn compile'
                }
            } 
        }
        stage('Test') {
            steps {
                script {
                    echo 'Test'
                    bat 'mvn test'
                }
            }            
        }
    }
}

//     environment {
//         dockerhub=credentials('dockerhub')
//         tagVersion='hjghjghj789'        
//     } 
    
//     stages {        
         
//         stage('Build') {
//             steps {
//                 script {
//                     echo 'Build'
//                     sh 'mvn compile'
//                 }
//             }
//         }
        
//         stage('Test stage') {
//             steps {
//                 script {
//                     echo 'Test'
//                     sh 'mvn test'
//                 }
//             }
//         }
        
//         stage('Package') {
//             steps {
//                 script {
//                     sh 'mvn package -Dmaven.test.skip'
//                     echo 'Package'
//                 }
//             }
//         }
        
//         stage('Build Docker image') {
//             steps {
//                 script {
//                     sh 'docker build -t app .'
//                     echo 'Build Docker image'
//                 }
//             }
//         }      
              
//         stage('Deploy Docker Login') {
//             steps {
//                 script {        
//                     sh 'echo $dockerhub_PSW | docker login -u $dockerhub_USR --password-stdin'
//                 }
//             }
//         }   
        
//         stage('Deploy Docker PUSH') {
//             steps {
//                 script { 
//                     sh 'docker tag app valeryvalavitski/app:${tagVersion}'
//                     sh 'docker push valeryvalavitski/app:${tagVersion}'
//                 }      
//             }
//         } 
        
//         stage('Run local'){
//             steps {
//                 script {
//                     sh 'docker run -d -p 8086:8086 app'
//                 }
//             }             
//         }
//     }
// }
