
class jenkins {
   def start () {
pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building...'
                // Adjust the build command for your language/environment
                sh 'mvn clean install' // Use 'npm install' for Node.js or 'dotnet build' for .NET
            }
        }

        stage('Test') {
            steps {
                echo 'Testing...'
                // Adjust the test command for your language/environment
                sh 'mvn test' // Use 'npm test' for Node.js or 'dotnet test' for .NET
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying...'
                // Adjust the deployment method as needed
                sh 'scp target/*.jar user@server:/path/to/deploy'
            }
        }
    }

    post {
        always {
            echo 'Cleaning up...'
            cleanWs() // Clean workspace after build
        }

        success {
            echo 'Pipeline completed successfully!'
        }

        failure {
            echo 'Pipeline failed!'
        }
    }
   }
  }
}
