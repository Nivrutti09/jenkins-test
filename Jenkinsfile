pipeline {
    agent any

    tools {
        maven "mvn3.9"
        jdk "jdk11"
    }

    stages {
        
        stage('Initialize'){
            steps{
                echo "PATH = ${M2_HOME}/bin:${PATH}"
                echo "M2_HOME = /opt/maven"
            }
        }
        
       stage('Build') {
            steps {
                dir("/home/ubuntu/.jenkins/workspace/pipeline") {
                  sh 'git fetch adsadsads'    
                  sh 'git checkout docker-example'
                  sh 'mvn -B clean package'
                  sh 'sudo docker build -t cicd-test .'
                }
            
         }  
        }
        
        stage('Deploy') {
            steps {
                 sh 'sudo docker-compose -p cicd-test up -d' 
                }
            
         }  
         
         stage('Testing') {
            steps {
                echo "testing"
            }
            
         } 
         stage('Release') {
            steps {
                echo "released"
            }
            
         } 
     }
    post {
        always {  
              echo 'always'  
         }  
         success {  
               mail bcc: '',  body: "<b>Example</b><br>Project: ${env.JOB_NAME} <br>Build Number: ${env.BUILD_NUMBER} <br> URL de build: ${env.BUILD_URL}", cc: '', charset: 'UTF-8', from: '', mimeType: 'text/html', replyTo: '', subject: "Build Success: Project name -> ${env.JOB_NAME}", to: "nivrutti.patil@veracity-india.com";  
        
         }  
         failure {  
              mail bcc: '',  body: "<b>Example</b><br>Project: ${env.JOB_NAME} <br>Build Number: ${env.BUILD_NUMBER} <br> URL de build: ${env.BUILD_URL}", cc: '', charset: 'UTF-8', from: '', mimeType: 'text/html', replyTo: '', subject: "Build Failed: Project name -> ${env.JOB_NAME}", to: "nivrutti.patil@veracity-india.com";  
        
         }  
         unstable {  
             echo 'This will run only if the run was marked as unstable'  
         }  
         changed {  
             echo 'This will run only if the state of the Pipeline has changed'  
             echo 'For example, if the Pipeline was previously failing but is now successful'  
         }  
   } 
}
