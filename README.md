# jgl
Alternative Steps to Set Up Maven
1. Download and Extract Maven Locally
Download Maven from the Apache Maven website.
Extract the downloaded file to a directory you have access to, e.g., C:\Users\<YourUsername>\Maven.
2. Configure Maven in Jenkins Without System Permissions
Add Maven in Global Tool Configuration:

Go to Jenkins Dashboard → Manage Jenkins → Global Tool Configuration.
Scroll to the Maven section.
Click Add Maven.
Uncheck the box that says "Install automatically."
Provide a name (e.g., MyLocalMaven) and specify the path to the Maven installation directory (e.g., C:\Users\<YourUsername>\Maven).
------
