1. create a new repository on github.com, after creation it takes you to repo with instructions page
2. in your local goto code directory and say "git init"
3. say "git status" . this tells you which branch you are on and which are the untracked files.
4. now say "git add <filename>" if you want to add all say "git add *" and chech git status again
5. git commit -m "first commit" this is to commit your changes to the branch you are in (master)
6. say "git status". This now says that there is nothing to commit.
7. now lets tell git that our origin (repo) is located at some url, so run "git remote add origin https://github.com/tewari2312/demo.git"
8. now git knows where to push and pull code from, but it doesn't have the credentials, to give credentials run "git remote set-url origin https://<your personal token>@github.com/tewari2312/demo" here after https we have my personal token which you create on github.com -> settings -> developer settings -> personal access tokens -> tokens classic -> create new token
9. Now push your changes to origin (remote repo) from your branch (master). use: "git push -u origin master".
10. goto your repo in github and see if your changes are there.