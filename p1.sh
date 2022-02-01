#!/bin/sh
echo "Installing openJDK 11..."
#sudo apt-get install openjdk-11-jdk

#Ask for the path of the key they downloaded
echo "Enter the full path of the key-pair you downloaded: (ex: /Users/username/Downloads)"
read key_path

#Ask for where they want to download the csv from the vm to
echo "Enter the full path of where you want to download the csv: (ex: /Users/username/Downloads)"
read csv_path
echo "If you are prompted, type 'yes'" 

#Set key permissions (to avoid errors)
chmod 600 $key_path/Team11Capstone.pem

#Download csv from vm instance
echo "Downloading en_es_alphabet.csv ..."
scp -i $key_path/Team11Capstone.pem ec2-user@54.147.48.55:/home/ec2-user/downloads/en_es_alphabet.csv $csv_path/en_es_alphabet.csv

#Open the vm?
echo "Opening the vm... "
echo "Type 'exit' to exit the vm..."
ssh -i $key_path/Team11Capstone.pem ec2-user@54.147.48.55

