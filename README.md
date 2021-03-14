# Creating Community Small Groups
A work by: Nathan Lee, Jason Woolley and Jason Djajasasmita.

The problem that we are trying to tackle is one in which we have a group of people that attend the same church but do not know each other very well. In order for these members to really get to know each other, they wish to visit each other's houses for small group which occurs once a week. Couples at this church wish to stay in the same small group as their respective partner each week. The end goal of our program is for each of the members of the church to visit the houses of all other members within the minimum number of weeks possible. 

## Description
The goal of our project is to get experience using Java, the external Graph library, and gain experience analyzing the time complexity of our solution. Another purpose of this project is to gain experience finding and using greedy algorithms for complex problems. We used Java to program our algorithm and used JGrapht as our external graph library.

## Requirements
In order to run the Jar file on the command line you must have Java 15.0.2 (most recent version) installed on your computer.

## User Manual
1. Clone the repository somewhere onto your computer.
2. Open terminal and cd into community-groups-term-proj-jason-nathan folder then cd into the BibleStudyAlgorithm_jar folder (<b>NOT the BibleStudyAlgorithm folder</b>).
3. Once you are in the BibleStudyAlgorithm_jar folder, run the command: <b>java -jar BibleStudyAlgorithm.jar</b>  <img width="656" alt="Screen Shot 2021-03-13 at 2 44 38 PM" src="https://user-images.githubusercontent.com/43599897/111051806-a8b67000-840a-11eb-98c4-e9497dd10a33.png">
4. You are now able to run the program.
5. The program will ask for a text file name. Please choose between the three given text files: group1.txt (16 names), group2.txt (29 names) and group3.txt (34 names).
6. The output of the program will appear in the console and will be written to a textfile with the name of your choosing.

*add here the link to the Youtube video showing the program running*

## Reflection
Let’s say n is the number of people and m is the size of the groups. In order for an individual A to visit everyone else’s home there must be at least n - 1 iterations. Then, everyone else must visit A’s home which would take at least (n - 1)/(m - 1) iterations. We get (n - 1)/(m - 1) iterations because each group has size m but only m - 1 are visitors. In order for A to have all people visit their home, A can have at most m - 1 people over at a time and must cover all n - 1 people. So, for a single person to visit all other peoples homes and for all other people to visit their home, it would take (n - 1) + (n - 1)/(m - 1) iterations. 

This indicates that for a single person to visit everyone and for everyone to visit them in an optimal number of iterations, they must visit n - 1 of the time and host (n - 1)/(m - 1) of the time.
So for a single person, an optimal host to visitor ratio would be:
* (n - 1)/(m - 1) : (n - 1)	which simplifies to 1 : m - 1 <br>

We know that we have n/m hosts and n - (n/m) visitors in our problem so we have a host to visitor ratio of:

* n/m : n - (n/m) which simplifies to 1 : m - 1 <br>

Since the ratios are equal, it implies that all people can have an optimal host to visitor ratio and complete visitations over (n - 1) + (n - 1)/(m - 1) iterations. Couples alter the optimal solution since couples are selected as hosts together which alters the host-to-visitor ratio slightly. This will add a variable number of iterations to the optimal solution depending on the number of couples.

We know the optimal will run (n - 1) + (n - 1)/(m - 1) iterations but each iteration must also be optimal. In order for one iteration to assign all people to groups, the optimal must go through the list of people and visit the first edge available. Assuming that edges are removed once people have visited each other, this should take no longer than O(nlogn). Thus we have O(nlogn) time running (n - 1) + (n - 1)/(m - 1) iterations so the time complexity should be O(n^2logn).

Our algorithm is similar to the theoretical optimum but can be improved. We start with a directed clique and have a loop that runs until we deconstruct the clique. We then have a loop that checks each person and a third loop that traverses their edges and assigns them as a visitor to the first free edge they see (while removing the edge). The first loops runs (n - 1) + (n - 1)/(m - 1) + C times where C is the number of weeks added by having some number of couples. The second loop runs n times as it loops through the list of people. The third loop runs in worst case n times if it has to traverse all edges. Our worst case time complexity is O(n^3) but we could improve our third loop if we found some sorting algorithm that sorted the edges by visitation status in O(logn) time. If this were achieved we would theoretically be at the optimal time complexity of O(n^2logn). 

The biggest hardship of this project was dealing with couples. We ran into trouble in situations where we filled all houses to max capacity but had one couple left to assign to the groups. Our initial algorithm allowed for houses to go one over capacity if we had any extra people left over but it did not allow two. To fix this, we added another assignment loop after the initial assignments were done, which put the couples in a house at two over capacity. This did not make our time complexity worse as it increase part of our algorithm to O(n + n) which is still considered O(n). 

## Results
<b><i>Program running with output for group1.txt</i></b><br>
<img width="652" alt="Screen Shot 2021-03-13 at 3 05 53 PM" src="https://user-images.githubusercontent.com/43599897/111052173-ae618500-840d-11eb-92ad-9d67ec8caff8.png">
<img width="465" alt="Screen Shot 2021-03-13 at 3 06 11 PM" src="https://user-images.githubusercontent.com/43599897/111052175-af92b200-840d-11eb-9424-e3ff429385af.png">

<b><i>Screenshot for output of group2.txt</i></b><br>
<img width="446" alt="Screen Shot 2021-03-13 at 3 01 23 PM" src="https://user-images.githubusercontent.com/43599897/111052103-fb912700-840c-11eb-8168-3ae8308bd853.png">
<img width="453" alt="Screen Shot 2021-03-13 at 3 02 13 PM" src="https://user-images.githubusercontent.com/43599897/111052120-23808a80-840d-11eb-98eb-ba7bb48de1c2.png">
<br>
<img width="456" alt="Screen Shot 2021-03-13 at 3 02 58 PM" src="https://user-images.githubusercontent.com/43599897/111052124-34310080-840d-11eb-9613-15e0a33ae8fc.png">
<img width="475" alt="Screen Shot 2021-03-13 at 3 04 31 PM" src="https://user-images.githubusercontent.com/43599897/111052149-76f2d880-840d-11eb-92f7-5dc685835ec1.png">

<b><i>Screenshot for output of group3.txt</i><b/><br>
<img width="451" alt="Screen Shot 2021-03-13 at 3 09 08 PM" src="https://user-images.githubusercontent.com/43599897/111052230-1adc8400-840e-11eb-8b3c-20275dc954c9.png">
<img width="460" alt="Screen Shot 2021-03-13 at 3 09 22 PM" src="https://user-images.githubusercontent.com/43599897/111052232-1d3ede00-840e-11eb-8c98-5791af99e9ae.png">
<img width="479" alt="Screen Shot 2021-03-13 at 3 10 01 PM" src="https://user-images.githubusercontent.com/43599897/111052248-419aba80-840e-11eb-9a59-bbc42c434741.png">
<img width="466" alt="Screen Shot 2021-03-13 at 3 10 19 PM" src="https://user-images.githubusercontent.com/43599897/111052250-45c6d800-840e-11eb-99ab-435e1a063e24.png">
<img width="467" alt="Screen Shot 2021-03-13 at 3 10 53 PM" src="https://user-images.githubusercontent.com/43599897/111052256-4eb7a980-840e-11eb-88bf-a6f3291cd3ff.png">
