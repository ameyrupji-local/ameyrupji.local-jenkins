| [Home](../README.md) ▸ **pipelines** |
|-----|

This folder contains the common pipelines built for the purpose of sharing and not rebuilding pipelines for Jenkins.

# Configure default Shared Library set up for Jenkins
Since we will be using a Shared library, Jenkins needs to be set up to use our Shared Library.

Navigate to Dashboard > select Manage Jenkins > select Configure System > scroll down to Global Pipeline Libraries > select Add
Enter microservice-pipelines in the Name field
Enter master in Default Version
This tells jenkins which branch of our Shared Library we plan to use by default.
Under Source Code Management, select Git
In the Project Repository field, enter https://github.com/kcrane3576/microservice-pipelines > select Save.


# Useful Links

- https://wiki.jenkins.io/display/JENKINS/GitHub+Plugin
- https://blog.ippon.tech/setting-up-a-shared-library-and-seed-job-in-jenkins-part-2/