pipeline{

    agent any 

    tools{
maven "MAVEN"
        jdk 'JAVA'
    }

    stages{

        stage('Checkout'){
            steps{
        
        checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: 'demo', url: 'https://github.com/rishvantsingh/maven-assignment']]])
            }
        }

        stage('Build'){

            steps{
                
                sh 'mvn clean'
                
                }
        }
        
        stage('Compiling'){
            steps{
                sh 'compile'
        }
        }
        
        stage('Package')
        {
            steps{
                sh 'mvn package'
            }
        }
    }
}
