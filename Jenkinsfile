pipeline {
agent any
 
 stages {
        stage('Build') { 
 
         steps {
          script {
           
          def gitbranch = "$GIT_BRANCH"
          echo "${gitbranch}"
    
           bat 'mvn clean install'
           
           
           
          }
         }
        }
 }
}
