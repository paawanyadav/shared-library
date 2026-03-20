def call(String appName, String environment = 'dev') {
    echo "Building ${appName} for ${environment} environment"
    sh "echo 'Building ${appName}...'"
    sh "echo 'Environment: ${environment}'"
}
