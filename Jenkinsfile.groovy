pipeline{

    agent any 

    tools{
maven "maven"
    }

    stages{

        stage('Checkout'){
            steps{
        
        checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: 'demo', url: 'https://github.com/rishvantsingh/maven-assignment']]])
            }
        }

        stage('Build'){

            steps{
                
                sh 'mvn clean install -f pom.xml'
                
                }


        }
    }
}