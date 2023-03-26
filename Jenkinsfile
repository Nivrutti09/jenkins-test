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
                sh 'mvn -B -DskipTests clean package'
                }
            }
        }
        stage('Deploy') {
            steps {
                sh 'echo "testing"'
                sh 'echo "test done"'
                }
            }
        }
        stage('Test') {
            steps {
                sh 'echo "testing"'
                sh 'echo "test done"'
                }
            }
        }
        stage('Release') {
            steps {
                sh 'echo "realesing"'
                sh 'echo "released"'
                }
            }
        }
        
     }
    post {
       always {
          junit(
        allowEmptyResults: true,
        testResults: '*/test-reports/.xml'
      )
      }
   } 
}