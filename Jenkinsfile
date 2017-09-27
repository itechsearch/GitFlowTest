pipeline{
    agent any
    stages{
        stage   ('Code Compile stage')
        {
            steps{
                withMaven(maven: 'MAVEN'){
                    shell 'mvn clean compile install'
                    echo 'completed'
                }
            }
        }
        stage   ('Testing stage')
                {
                    steps{
                        withMaven(maven: 'MAVEN'){
                            shell 'mvn test'
                        }
                    }
                }
        stage   ('Deployment stage')
                        {
                            steps{
                                withMaven(maven: 'MAVEN'){
                                    shell 'mvn deploy'
                                }
                            }
                        }
    }
}