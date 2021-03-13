# Creating Community Small Groups
A work by: Nathan Lee, Jason Woolley and Jason Djajasasmita

The problem that we are trying to tackle is one in which we have a group of people that attend the same church but do not know each other very well. In order for these members to really get to know each other, they wish to visit each other's houses for small group which occurs once a week. Couples at this church wish to stay in the same small group as their respective partner each week. The end goal of our program is for each of the members of the church to visit the houses of all other members within the minimum number of weeks possible. 

## Description
*Describe what your project is about and what language you used*

The goal of our project is to get experience using Java, the external Graph library, and gain experience analyzing the time complexity of our solution. Another purpose of this project is to gain experience finding and using greedy algorithms for complex problems. We used Java to program our algorithm and used JGrapht as our external graph library. *maybe write about our algorithm step by step here*

## Requirements
*The requirements of the program, i.e. Python 3.1, what libraries are needed*

Java 15.0.2 (most recent)

## User Manual
*Once a person clones this into their computer how the person is supposed to run the program, add screenshots showing how your program works, also add here the link to the Youtube video showing the program running*
After cloning the program, go to the command line an

## Reflection
*Write the reflection about getting the small groups in the minimum number of iterations, etc.*

## Results
*Include screenshots of your program running, and the list of weekly groups for each of your three files.*


### Output for group1.txt 
Week 1:
House 0: Reiner(host) | [﻿Elly, Bertholdt, Annie, Henry, Tim]
House 1: Chris(host) | [Cody + Anna, Eric + Michelle]
House 2: Mark(host) | [Jennie, Tyler, Andrew, Kyle]

Week 2:
House 0: Bertholdt(host) | [﻿Elly, Reiner, Annie, Chris, Tim]
House 1: Eric + Michelle(host) | [Cody + Anna, Henry]
House 2: Tyler(host) | [Jennie, Mark, Andrew, Kyle]

Week 3:
House 0: Annie(host) | [﻿Elly, Reiner, Bertholdt, Chris, Tim]
House 1: Henry(host) | [Cody + Anna, Eric + Michelle]
House 2: Andrew(host) | [Jennie, Mark, Tyler, Kyle]

Week 4:
House 0: Cody + Anna(host) | [﻿Elly, Reiner, Bertholdt, Tim]
House 1: Chris(host) | [Annie, Henry, Mark, Tyler]
House 2: Jennie(host) | [Eric + Michelle, Andrew, Kyle]

Week 5:
House 0: Chris(host) | [﻿Elly, Reiner, Bertholdt, Andrew]
House 1: Cody + Anna(host) | [Annie, Eric + Michelle, Kyle]
House 2: Jennie(host) | [Henry, Mark, Tyler, Tim]

Week 6:
House 0: Eric + Michelle(host) | [﻿Elly, Reiner, Bertholdt, Andrew]
House 1: Henry(host) | [Annie, Chris, Mark, Tyler]
House 2: Jennie(host) | [Cody + Anna, Kyle, Tim]

Week 7:
House 0: Henry(host) | [﻿Elly, Reiner, Bertholdt, Andrew]
House 1: Eric + Michelle(host) | [Annie, Chris, Jennie, Tyler]
House 2: Mark(host) | [Cody + Anna, Tim, Kyle]

Week 8:
House 0: Jennie(host) | [﻿Elly, Reiner, Bertholdt, Annie, Andrew]
House 1: Tyler(host) | [Cody + Anna, Tim, Kyle]
House 2: Mark(host) | [Chris, Eric + Michelle, Henry]

Week 9:
House 0: Mark(host) | [﻿Elly, Reiner, Bertholdt, Annie]
House 1: Andrew(host) | [Cody + Anna, Eric + Michelle, Henry]
House 2: Jennie(host) | [Chris, Tyler, Kyle, Tim]

Week 10:
House 0: Tyler(host) | [﻿Elly, Reiner, Bertholdt, Annie, Henry]
House 1: Kyle(host) | [Cody + Anna, Eric + Michelle]
House 2: Andrew(host) | [Chris, Tim, Jennie, Mark]

Week 11:
House 0: Andrew(host) | [﻿Elly, Reiner, Bertholdt, Annie]
House 1: Tim(host) | [Cody + Anna, Henry, Jennie, Mark]
House 2: Tyler(host) | [Chris, Eric + Michelle, Kyle]

Week 12:
House 0: Kyle(host) | [﻿Elly, Reiner, Bertholdt, Annie]
House 1: Cody + Anna(host) | [Chris, Henry, Jennie, Mark]
House 2: Tim(host) | [Eric + Michelle, Tyler, Andrew]

Week 13:
House 0: Tim(host) | [﻿Elly, Reiner, Bertholdt, Annie]
House 1: Kyle(host) | [Chris, Henry, Jennie, Tyler, Andrew]
House 2: Eric + Michelle(host) | [Mark, Cody + Anna]

Week 14:
House 0: ﻿Elly(host) | [Reiner, Bertholdt, Annie, Cody + Anna]
House 1: Tim(host) | [Chris, Eric + Michelle, Mark]
House 2: Henry(host) | [Jennie, Kyle, Tyler, Andrew]

Week 15:
House 0: Reiner(host) | [Cody + Anna, Jennie, Mark]
House 1: ﻿Elly(host) | [Chris, Eric + Michelle, Henry, Tim]
House 2: Bertholdt(host) | [Tyler, Andrew, Kyle, Annie]

Week 16:
House 0: Bertholdt(host) | [Cody + Anna, Henry, Annie, Tim]
House 1: Reiner(host) | [Chris, Eric + Michelle, Kyle]
House 2: ﻿Elly(host) | [Jennie, Mark, Tyler, Andrew]

Week 17:
House 0: Annie(host) | [Cody + Anna, Henry, Kyle, ﻿Elly]
House 1: Bertholdt(host) | [Eric + Michelle, Jennie, Mark]
House 2: Reiner(host) | [Tyler, Andrew, Chris, Tim]

Week 18:
House 0: Annie(host) | [Eric + Michelle, Jennie, Mark, Reiner]
House 1: Cody + Anna(host) | [Tyler, Andrew, Bertholdt]
House 2: ﻿Elly(host) | [Kyle, Chris, Henry, Tim]

Week 19:
House 0: Chris(host) | [Jennie, Tim, ﻿Elly, Reiner, Bertholdt]
House 1: Kyle(host) | [Mark, Cody + Anna, Henry]
House 2: Annie(host) | [Tyler, Andrew, Eric + Michelle]

Week 20:
House 0: Chris(host) | [Kyle, ﻿Elly, Reiner, Bertholdt, Annie]
House 1: Eric + Michelle(host) | [Tim, Cody + Anna]
House 2: Henry(host) | [Jennie, Mark, Tyler, Andrew]

Week 21:
House 0: Eric + Michelle(host) | [Kyle, ﻿Elly, Reiner, Bertholdt]
House 1: Henry(host) | [Tim, Annie, Cody + Anna]
House 2: Chris(host) | [Jennie, Mark, Tyler, Andrew]

Week 22:
House 0: Tim(host) | [Kyle, ﻿Elly, Reiner, Bertholdt, Annie]
House 1: Cody + Anna(host) | [Chris, Eric + Michelle]
House 2: Henry(host) | [Jennie, Mark, Tyler, Andrew]

Week 23:
House 0: Kyle(host) | [Tim, ﻿Elly, Reiner, Bertholdt, Annie]
House 1: Cody + Anna(host) | [Chris, Eric + Michelle]
House 2: Henry(host) | [Jennie, Mark, Tyler, Andrew]

### Output for group2.txt
Week 1:
Group 0: Reiner(host) | [﻿Elly, Bertholdt, Annie, Henry, Barney]
Group 1: Chris(host) | [Cody + Anna, Eric + Michelle, Kurt]
Group 2: Mark(host) | [Jennie, Tyler, Andrew, Kyle]
Group 3: Sam + Andy(host) | [Tim, Chandler, Joey]
Group 4: Rachel(host) | [Monica, Phoebe, Ted, Robin]

Week 2:
Group 0: Bertholdt(host) | [﻿Elly, Reiner, Annie, Chris, Barney]
Group 1: Eric + Michelle(host) | [Cody + Anna, Henry, Kurt]
Group 2: Tyler(host) | [Jennie, Mark, Andrew, Kyle]
Group 3: Chandler(host) | [Tim, Sam + Andy, Joey]
Group 4: Phoebe(host) | [Monica, Rachel, Ted, Robin]

Week 3:
Group 0: Annie(host) | [﻿Elly, Reiner, Bertholdt, Chris, Barney]
Group 1: Henry(host) | [Cody + Anna, Eric + Michelle, Kurt]
Group 2: Andrew(host) | [Jennie, Mark, Tyler, Kyle]
Group 3: Joey(host) | [Tim, Sam + Andy, Chandler]
Group 4: Ted(host) | [Monica, Rachel, Phoebe, Robin]

Week 4:
Group 0: Cody + Anna(host) | [﻿Elly, Reiner, Bertholdt, Phoebe]
Group 1: Chris(host) | [Annie, Henry, Mark, Tyler, Ted]
Group 2: Jennie(host) | [Eric + Michelle, Andrew, Kyle, Robin]
Group 3: Monica(host) | [Tim, Sam + Andy, Chandler, Kurt]
Group 4: Rachel(host) | [Joey, Marshall + Lily, Barney]

Week 5:
Group 0: Chris(host) | [﻿Elly, Reiner, Bertholdt, Andrew]
Group 1: Cody + Anna(host) | [Annie, Eric + Michelle, Barney]
Group 2: Jennie(host) | [Henry, Mark, Tyler, Chandler, Kurt]
Group 3: Tim(host) | [Kyle, Sam + Andy, Joey]
Group 4: Robin(host) | [Monica, Rachel, Phoebe, Ted]

Week 6:
Group 0: Eric + Michelle(host) | [﻿Elly, Reiner, Bertholdt, Ted]
Group 1: Henry(host) | [Annie, Chris, Mark, Tyler, Robin]
Group 2: Jennie(host) | [Cody + Anna, Tim, Joey, Barney]
Group 3: Kyle(host) | [Andrew, Sam + Andy, Chandler, Kurt]
Group 4: Marshall + Lily(host) | [Monica, Rachel, Phoebe]

Week 7:
Group 0: Henry(host) | [﻿Elly, Reiner, Bertholdt, Andrew, Ted]
Group 1: Eric + Michelle(host) | [Annie, Chris, Jennie, Robin]
Group 2: Mark(host) | [Cody + Anna, Tim, Chandler, Barney]
Group 3: Kyle(host) | [Tyler, Joey, Monica, Phoebe]
Group 4: Rachel(host) | [Sam + Andy, Kurt, Marshall + Lily]

Week 8:
Group 0: Jennie(host) | [﻿Elly, Reiner, Bertholdt, Annie]
Group 1: Tyler(host) | [Cody + Anna, Chandler, Joey, Barney]
Group 2: Mark(host) | [Chris, Eric + Michelle, Henry, Kurt]
Group 3: Tim(host) | [Andrew, Monica, Rachel, Phoebe]
Group 4: Sam + Andy(host) | [Kyle, Ted, Robin]

Week 9:
Group 0: Mark(host) | [﻿Elly, Reiner, Bertholdt, Annie]
Group 1: Andrew(host) | [Cody + Anna, Joey, Rachel, Barney]
Group 2: Jennie(host) | [Chris, Sam + Andy, Monica]
Group 3: Tyler(host) | [Eric + Michelle, Henry, Tim, Kurt]
Group 4: Chandler(host) | [Kyle, Phoebe, Ted, Robin]

Week 10:
Group 0: Tyler(host) | [﻿Elly, Reiner, Bertholdt, Annie, Monica]
Group 1: Kyle(host) | [Cody + Anna, Jennie, Mark, Robin]
Group 2: Andrew(host) | [Chris, Eric + Michelle, Henry, Ted]
Group 3: Rachel(host) | [Tim, Chandler, Barney, Kurt]
Group 4: Phoebe(host) | [Sam + Andy, Joey, Marshall + Lily]

Week 11:
Group 0: Andrew(host) | [﻿Elly, Reiner, Bertholdt, Annie, Monica]
Group 1: Tim(host) | [Cody + Anna, Jennie, Mark, Joey]
Group 2: Tyler(host) | [Chris, Sam + Andy, Rachel, Robin]
Group 3: Kyle(host) | [Eric + Michelle, Henry, Ted]
Group 4: Phoebe(host) | [Chandler, Barney, Kurt, Marshall + Lily]

Week 12:
Group 0: Kyle(host) | [﻿Elly, Reiner, Bertholdt, Annie, Barney]
Group 1: Sam + Andy(host) | [Cody + Anna, Jennie]
Group 2: Tim(host) | [Chris, Eric + Michelle, Henry, Kurt]
Group 3: Chandler(host) | [Mark, Tyler, Andrew, Rachel]
Group 4: Monica(host) | [Joey, Phoebe, Ted, Robin]

Week 13:
Group 0: Tim(host) | [﻿Elly, Reiner, Bertholdt, Annie, Ted]
Group 1: Chandler(host) | [Cody + Anna, Jennie, Monica, Kurt]
Group 2: Kyle(host) | [Chris, Rachel, Marshall + Lily]
Group 3: Sam + Andy(host) | [Eric + Michelle, Henry, Barney]
Group 4: Joey(host) | [Mark, Tyler, Andrew, Phoebe, Robin]

Week 14:
Group 0: Sam + Andy(host) | [﻿Elly, Reiner, Bertholdt, Phoebe]
Group 1: Chandler(host) | [Annie, Chris, Eric + Michelle, Kurt]
Group 2: Joey(host) | [Cody + Anna, Henry, Jennie, Ted]
Group 3: Monica(host) | [Mark, Andrew, Kyle, Rachel]
Group 4: Tim(host) | [Tyler, Robin, Marshall + Lily, Barney]

Week 15:
Group 0: Chandler(host) | [﻿Elly, Reiner, Bertholdt, Henry, Barney]
Group 1: Sam + Andy(host) | [Annie, Chris, Mark, Kurt]
Group 2: Monica(host) | [Cody + Anna, Jennie, Tyler, Tim]
Group 3: Joey(host) | [Eric + Michelle, Kyle, Marshall + Lily]
Group 4: Rachel(host) | [Andrew, Phoebe, Ted, Robin]

Week 16:
Group 0: Joey(host) | [﻿Elly, Reiner, Bertholdt, Annie, Barney]
Group 1: Rachel(host) | [Cody + Anna, Jennie, Mark, Chandler]
Group 2: Monica(host) | [Chris, Eric + Michelle, Henry, Ted]
Group 3: Sam + Andy(host) | [Tyler, Andrew, Marshall + Lily]
Group 4: Phoebe(host) | [Kyle, Tim, Robin, Kurt]

Week 17:
Group 0: Monica(host) | [﻿Elly, Reiner, Bertholdt, Annie, Barney]
Group 1: Phoebe(host) | [Cody + Anna, Jennie, Mark, Chandler]
Group 2: Joey(host) | [Chris, Kurt, Robin, Marshall + Lily]
Group 3: Rachel(host) | [Eric + Michelle, Henry, Tyler]
Group 4: Ted(host) | [Andrew, Kyle, Tim, Sam + Andy]

Week 18:
Group 0: Rachel(host) | [﻿Elly, Reiner, Bertholdt, Annie, Monica]
Group 1: Ted(host) | [Cody + Anna, Jennie, Mark, Joey]
Group 2: Phoebe(host) | [Chris, Eric + Michelle, Henry]
Group 3: Robin(host) | [Tyler, Andrew, Kyle, Tim, Barney]
Group 4: Marshall + Lily(host) | [Sam + Andy, Chandler, Kurt]

Week 19:
Group 0: Phoebe(host) | [﻿Elly, Reiner, Bertholdt, Annie, Monica]
Group 1: Robin(host) | [Cody + Anna, Jennie, Mark, Kurt]
Group 2: Rachel(host) | [Chris, Kyle, Sam + Andy]
Group 3: Ted(host) | [Eric + Michelle, Henry, Tyler, Chandler]
Group 4: Marshall + Lily(host) | [Andrew, Tim, Joey, Barney]

Week 20:
Group 0: Ted(host) | [﻿Elly, Reiner, Bertholdt, Annie, Kurt]
Group 1: Marshall + Lily(host) | [Cody + Anna, Jennie, Joey]
Group 2: Robin(host) | [Chris, Eric + Michelle, Henry, Chandler]
Group 3: Barney(host) | [Mark, Kyle, Tim, Sam + Andy]
Group 4: Phoebe(host) | [Tyler, Andrew, Monica, Rachel]

Week 21:
Group 0: Robin(host) | [﻿Elly, Reiner, Bertholdt, Annie, Joey]
Group 1: Barney(host) | [Cody + Anna, Jennie, Tyler, Chandler]
Group 2: Ted(host) | [Chris, Sam + Andy, Rachel, Phoebe]
Group 3: Marshall + Lily(host) | [Eric + Michelle, Henry]
Group 4: Kurt(host) | [Mark, Andrew, Kyle, Tim, Monica]

Week 22:
Group 0: Marshall + Lily(host) | [﻿Elly, Reiner, Bertholdt, Mark]
Group 1: Barney(host) | [Annie, Chris, Eric + Michelle, Andrew]
Group 2: Kurt(host) | [Cody + Anna, Henry, Jennie, Tyler]
Group 3: Kyle(host) | [Tim, Chandler, Joey, Monica, Rachel]
Group 4: Robin(host) | [Sam + Andy, Phoebe, Ted]

Week 23:
Group 0: Barney(host) | [﻿Elly, Reiner, Bertholdt, Joey, Monica]
Group 1: Marshall + Lily(host) | [Annie, Tyler, Kyle, Ted]
Group 2: Cody + Anna(host) | [Chris, Henry, Jennie, Mark]
Group 3: Kurt(host) | [Eric + Michelle, Rachel, Phoebe]
Group 4: Andrew(host) | [Tim, Sam + Andy, Chandler, Robin]

Week 24:
Group 0: Kurt(host) | [﻿Elly, Reiner, Bertholdt, Annie, Joey]
Group 1: Marshall + Lily(host) | [Chris, Robin, Jennie, Monica]
Group 2: Barney(host) | [Henry, Rachel, Phoebe, Ted]
Group 3: Eric + Michelle(host) | [Mark, Tim, Sam + Andy]
Group 4: Cody + Anna(host) | [Tyler, Andrew, Kyle, Chandler]

Week 25:
Group 0: ﻿Elly(host) | [Reiner, Bertholdt, Annie, Cody + Anna]
Group 1: Kurt(host) | [Chris, Chandler, Ted, Robin]
Group 2: Henry(host) | [Jennie, Tim, Sam + Andy]
Group 3: Eric + Michelle(host) | [Tyler, Andrew, Kyle, Barney]
Group 4: Mark(host) | [Joey, Monica, Rachel, Phoebe]

Week 26:
Group 0: Reiner(host) | [Cody + Anna, Jennie, Mark, Rachel]
Group 1: ﻿Elly(host) | [Chris, Eric + Michelle, Henry, Monica]
Group 2: Bertholdt(host) | [Tyler, Andrew, Kyle, Tim, Phoebe]
Group 3: Annie(host) | [Sam + Andy, Chandler, Joey, Ted]
Group 4: Barney(host) | [Robin, Marshall + Lily, Kurt]

Week 27:
Group 0: Bertholdt(host) | [Cody + Anna, Henry, Chandler, Robin]
Group 1: Reiner(host) | [Chris, Eric + Michelle, Kyle, Ted]
Group 2: ﻿Elly(host) | [Jennie, Mark, Tyler, Andrew, Joey]
Group 3: Annie(host) | [Tim, Monica, Rachel, Phoebe]
Group 4: Kurt(host) | [Sam + Andy, Marshall + Lily, Barney]

Week 28:
Group 0: Annie(host) | [Cody + Anna, Henry, Robin, Barney]
Group 1: Bertholdt(host) | [Eric + Michelle, Jennie, Mark]
Group 2: Reiner(host) | [Tyler, Andrew, Chandler, Joey, Kurt]
Group 3: ﻿Elly(host) | [Kyle, Tim, Sam + Andy, Ted]
Group 4: Chris(host) | [Monica, Rachel, Phoebe, Marshall + Lily]

Week 29:
Group 0: Annie(host) | [Eric + Michelle, Jennie, Mark, Tyler]
Group 1: Chris(host) | [Kyle, Barney, Cody + Anna, Henry]
Group 2: Reiner(host) | [Tim, Sam + Andy, Monica, Andrew]
Group 3: ﻿Elly(host) | [Chandler, Rachel, Phoebe, Robin, Kurt]
Group 4: Bertholdt(host) | [Joey, Ted, Marshall + Lily]

Week 30:
Group 0: Chris(host) | [Jennie, Chandler, ﻿Elly, Eric + Michelle]
Group 1: Annie(host) | [Andrew, Kyle, Kurt, Henry, Mark]
Group 2: Cody + Anna(host) | [Tim, Joey, Ted, Tyler]
Group 3: Bertholdt(host) | [Sam + Andy, Monica, Rachel, Barney]
Group 4: Reiner(host) | [Phoebe, Robin, Marshall + Lily]

Week 31:
Group 0: Henry(host) | [Kyle, Marshall + Lily, Barney, ﻿Elly]
Group 1: Chris(host) | [Tim, Joey, Robin, Reiner, Bertholdt]
Group 2: Cody + Anna(host) | [Sam + Andy, Monica, Kurt]
Group 3: Eric + Michelle(host) | [Chandler, Rachel, Phoebe, Annie]
Group 4: Jennie(host) | [Ted, Mark, Tyler, Andrew]

Week 32:
Group 0: Chris(host) | [Sam + Andy, ﻿Elly, Reiner, Bertholdt]
Group 1: Henry(host) | [Chandler, Phoebe, Annie, Jennie, Tyler]
Group 2: Eric + Michelle(host) | [Joey, Monica, Andrew, Kyle]
Group 3: Cody + Anna(host) | [Rachel, Robin, Tim, Barney]
Group 4: Mark(host) | [Ted, Marshall + Lily, Kurt]

Week 33:
Group 0: Mark(host) | [Sam + Andy, Robin, ﻿Elly, Reiner]
Group 1: Tim(host) | [Chandler, Bertholdt, Annie, Cody + Anna]
Group 2: Henry(host) | [Joey, Monica, Rachel, Chris, Andrew]
Group 3: Jennie(host) | [Phoebe, Marshall + Lily, Eric + Michelle]
Group 4: Tyler(host) | [Ted, Kyle, Barney, Kurt]

Week 34:
Group 0: Sam + Andy(host) | [Monica, Reiner, Annie, Chris]
Group 1: Jennie(host) | [Rachel, Cody + Anna, Eric + Michelle]
Group 2: Tyler(host) | [Phoebe, Henry, Mark, Andrew, Kyle]
Group 3: ﻿Elly(host) | [Marshall + Lily, Barney, Tim, Chandler]
Group 4: Bertholdt(host) | [Kurt, Joey, Ted, Robin]

Week 35:
Group 0: Joey(host) | [Monica, ﻿Elly, Reiner, Bertholdt, Chris]
Group 1: Sam + Andy(host) | [Rachel, Cody + Anna, Henry]
Group 2: Andrew(host) | [Phoebe, Kurt, Eric + Michelle, Jennie]
Group 3: Annie(host) | [Marshall + Lily, Mark, Tyler, Kyle]
Group 4: Ted(host) | [Barney, Tim, Chandler, Robin]

Week 36:
Group 0: Joey(host) | [Rachel, ﻿Elly, Reiner, Bertholdt, Annie]
Group 1: Cody + Anna(host) | [Marshall + Lily, Chris, Henry]
Group 2: Eric + Michelle(host) | [Jennie, Mark, Tyler, Andrew]
Group 3: Kyle(host) | [Tim, Sam + Andy, Chandler, Monica]
Group 4: Phoebe(host) | [Ted, Robin, Barney, Kurt]

Week 37:
Group 0: Eric + Michelle(host) | [Marshall + Lily, ﻿Elly, Reiner]
Group 1: Bertholdt(host) | [Annie, Cody + Anna, Chris, Henry]
Group 2: Jennie(host) | [Mark, Tyler, Andrew, Kyle, Tim]
Group 3: Sam + Andy(host) | [Chandler, Joey, Monica, Rachel]
Group 4: Phoebe(host) | [Ted, Robin, Barney, Kurt]

Week 38:
Group 0: Tyler(host) | [Marshall + Lily, ﻿Elly, Reiner, Bertholdt]
Group 1: Annie(host) | [Cody + Anna, Chris, Eric + Michelle]
Group 2: Henry(host) | [Jennie, Mark, Andrew, Kyle, Tim]
Group 3: Sam + Andy(host) | [Chandler, Joey, Monica, Rachel]
Group 4: Phoebe(host) | [Ted, Robin, Barney, Kurt]

Week 39:
Group 0: Andrew(host) | [Marshall + Lily, ﻿Elly, Reiner, Bertholdt]
Group 1: Annie(host) | [Cody + Anna, Chris, Eric + Michelle]
Group 2: Henry(host) | [Jennie, Mark, Tyler, Kyle, Tim]
Group 3: Sam + Andy(host) | [Chandler, Joey, Monica, Rachel]
Group 4: Phoebe(host) | [Ted, Robin, Barney, Kurt]

Week 40:
Group 0: Chandler(host) | [Marshall + Lily, ﻿Elly, Reiner, Bertholdt]
Group 1: Annie(host) | [Cody + Anna, Chris, Eric + Michelle]
Group 2: Henry(host) | [Jennie, Mark, Tyler, Andrew, Kyle]
Group 3: Tim(host) | [Sam + Andy, Joey, Monica, Rachel]
Group 4: Phoebe(host) | [Ted, Robin, Barney, Kurt]

Week 41:
Group 0: Monica(host) | [Marshall + Lily, ﻿Elly, Reiner, Bertholdt]
Group 1: Annie(host) | [Cody + Anna, Chris, Eric + Michelle]
Group 2: Henry(host) | [Jennie, Mark, Tyler, Andrew, Kyle]
Group 3: Tim(host) | [Sam + Andy, Chandler, Joey, Rachel]
Group 4: Phoebe(host) | [Ted, Robin, Barney, Kurt]

Week 42:
Group 0: Ted(host) | [Marshall + Lily, ﻿Elly, Reiner, Bertholdt]
Group 1: Annie(host) | [Cody + Anna, Chris, Eric + Michelle]
Group 2: Henry(host) | [Jennie, Mark, Tyler, Andrew, Kyle]
Group 3: Tim(host) | [Sam + Andy, Chandler, Joey, Monica]
Group 4: Rachel(host) | [Phoebe, Robin, Barney, Kurt]

Week 43:
Group 0: Robin(host) | [Marshall + Lily, ﻿Elly, Reiner, Bertholdt]
Group 1: Annie(host) | [Cody + Anna, Chris, Eric + Michelle]
Group 2: Henry(host) | [Jennie, Mark, Tyler, Andrew, Kyle]
Group 3: Tim(host) | [Sam + Andy, Chandler, Joey, Monica]
Group 4: Rachel(host) | [Phoebe, Ted, Barney, Kurt]

### Output for group3.txt
Week 1:
Group 0: Reiner(host) | [Elly, Bertholdt, Annie, Henry, Addy]
Group 1: Chris(host) | [Cody + Anna, Eric + Michelle, Fina]
Group 2: Mark(host) | [Jennie, Tyler, Andrew, Kyle, Heisenberg]
Group 3: Sam + Andy(host) | [Tim, Chandler, Joey, Jesse]
Group 4: Rachel(host) | [Monica, Phoebe, Ted, Robin]
Group 5: Barney(host) | [Marshall + Lily, Kurt, Phillip]

Week 2:
Group 0: Bertholdt(host) | [Elly, Reiner, Annie, Chris, Addy]
Group 1: Eric + Michelle(host) | [Cody + Anna, Henry, Fina]
Group 2: Tyler(host) | [Jennie, Mark, Andrew, Kyle, Heisenberg]
Group 3: Chandler(host) | [Tim, Sam + Andy, Joey, Jesse]
Group 4: Phoebe(host) | [Monica, Rachel, Ted, Robin]
Group 5: Kurt(host) | [Marshall + Lily, Barney, Phillip]

Week 3:
Group 0: Annie(host) | [Elly, Reiner, Bertholdt, Chris, Addy]
Group 1: Henry(host) | [Cody + Anna, Eric + Michelle, Fina]
Group 2: Andrew(host) | [Jennie, Mark, Tyler, Kyle, Heisenberg]
Group 3: Joey(host) | [Tim, Sam + Andy, Chandler, Jesse]
Group 4: Ted(host) | [Monica, Rachel, Phoebe, Robin]
Group 5: Phillip(host) | [Marshall + Lily, Barney, Kurt]

Week 4:
Group 0: Cody + Anna(host) | [Elly, Reiner, Bertholdt, Addy]
Group 1: Chris(host) | [Annie, Henry, Mark, Tyler, Heisenberg]
Group 2: Jennie(host) | [Eric + Michelle, Andrew, Kyle, Fina]
Group 3: Monica(host) | [Tim, Sam + Andy, Chandler, Jesse]
Group 4: Rachel(host) | [Joey, Marshall + Lily, Barney]
Group 5: Robin(host) | [Phoebe, Ted, Kurt, Phillip]

Week 5:
Group 0: Chris(host) | [Elly, Reiner, Bertholdt, Andrew, Jesse]
Group 1: Cody + Anna(host) | [Annie, Eric + Michelle, Phillip]
Group 2: Jennie(host) | [Henry, Mark, Tyler, Chandler, Heisenberg]
Group 3: Tim(host) | [Kyle, Sam + Andy, Joey, Fina]
Group 4: Robin(host) | [Monica, Rachel, Barney, Addy]
Group 5: Marshall + Lily(host) | [Phoebe, Ted, Kurt]

Week 6:
Group 0: Eric + Michelle(host) | [Elly, Reiner, Bertholdt, Kurt]
Group 1: Henry(host) | [Annie, Chris, Mark, Tyler, Phillip]
Group 2: Jennie(host) | [Cody + Anna, Tim, Joey, Jesse]
Group 3: Kyle(host) | [Andrew, Sam + Andy, Chandler, Heisenberg]
Group 4: Marshall + Lily(host) | [Monica, Rachel, Robin]
Group 5: Barney(host) | [Phoebe, Ted, Addy, Fina]

Week 7:
Group 0: Henry(host) | [Elly, Reiner, Bertholdt, Andrew, Jesse]
Group 1: Eric + Michelle(host) | [Annie, Chris, Jennie, Barney]
Group 2: Mark(host) | [Cody + Anna, Tim, Chandler]
Group 3: Kyle(host) | [Tyler, Joey, Monica, Phoebe]
Group 4: Rachel(host) | [Sam + Andy, Phillip, Addy]
Group 5: Kurt(host) | [Ted, Robin, Fina, Heisenberg]

Week 8:
Group 0: Jennie(host) | [Elly, Reiner, Bertholdt, Annie, Phillip]
Group 1: Tyler(host) | [Cody + Anna, Chandler, Joey, Jesse]
Group 2: Mark(host) | [Chris, Eric + Michelle, Henry, Fina]
Group 3: Tim(host) | [Andrew, Monica, Rachel, Phoebe, Heisenberg]
Group 4: Sam + Andy(host) | [Kyle, Ted, Robin]
Group 5: Addy(host) | [Marshall + Lily, Barney, Kurt]

Week 9:
Group 0: Mark(host) | [Elly, Reiner, Bertholdt, Annie, Phillip]
Group 1: Andrew(host) | [Cody + Anna, Joey, Rachel, Jesse]
Group 2: Jennie(host) | [Chris, Sam + Andy, Monica, Addy]
Group 3: Tyler(host) | [Eric + Michelle, Henry, Tim]
Group 4: Chandler(host) | [Kyle, Phoebe, Ted, Robin, Heisenberg]
Group 5: Fina(host) | [Marshall + Lily, Barney, Kurt]

Week 10:
Group 0: Tyler(host) | [Elly, Reiner, Bertholdt, Annie, Phillip]
Group 1: Kyle(host) | [Cody + Anna, Jennie, Mark, Jesse]
Group 2: Andrew(host) | [Chris, Eric + Michelle, Henry, Addy]
Group 3: Rachel(host) | [Tim, Chandler, Kurt, Fina]
Group 4: Phoebe(host) | [Sam + Andy, Marshall + Lily]
Group 5: Monica(host) | [Joey, Ted, Robin, Barney, Heisenberg]

Week 11:
Group 0: Andrew(host) | [Elly, Reiner, Bertholdt, Annie]
Group 1: Tim(host) | [Cody + Anna, Jennie, Mark, Jesse]
Group 2: Tyler(host) | [Chris, Sam + Andy, Monica]
Group 3: Kyle(host) | [Eric + Michelle, Henry, Rachel]
Group 4: Phoebe(host) | [Chandler, Joey, Barney, Kurt, Heisenberg]
Group 5: Phillip(host) | [Ted, Robin, Addy, Fina]

Week 12:
Group 0: Kyle(host) | [Elly, Reiner, Bertholdt, Annie, Phillip]
Group 1: Sam + Andy(host) | [Cody + Anna, Jennie, Phoebe]
Group 2: Tim(host) | [Chris, Eric + Michelle, Henry, Addy]
Group 3: Chandler(host) | [Mark, Tyler, Andrew, Monica, Fina]
Group 4: Ted(host) | [Joey, Marshall + Lily, Kurt]
Group 5: Barney(host) | [Rachel, Robin, Heisenberg, Jesse]

Week 13:
Group 0: Tim(host) | [Elly, Reiner, Bertholdt, Annie, Barney]
Group 1: Chandler(host) | [Cody + Anna, Jennie, Rachel]
Group 2: Kyle(host) | [Chris, Ted, Robin, Marshall + Lily]
Group 3: Sam + Andy(host) | [Eric + Michelle, Henry, Phillip]
Group 4: Joey(host) | [Mark, Tyler, Andrew, Monica, Fina]
Group 5: Kurt(host) | [Phoebe, Addy, Jesse, Heisenberg]

Week 14:
Group 0: Sam + Andy(host) | [Elly, Reiner, Bertholdt, Barney]
Group 1: Chandler(host) | [Annie, Chris, Eric + Michelle, Kurt]
Group 2: Joey(host) | [Cody + Anna, Henry, Jennie, Addy]
Group 3: Monica(host) | [Mark, Andrew, Kyle, Rachel]
Group 4: Tim(host) | [Tyler, Ted, Robin, Marshall + Lily]
Group 5: Phillip(host) | [Phoebe, Heisenberg, Jesse, Fina]

Week 15:
Group 0: Chandler(host) | [Elly, Reiner, Bertholdt, Henry, Barney]
Group 1: Sam + Andy(host) | [Annie, Chris, Mark, Kurt]
Group 2: Monica(host) | [Cody + Anna, Jennie, Tyler]
Group 3: Joey(host) | [Eric + Michelle, Kyle, Ted, Robin]
Group 4: Rachel(host) | [Andrew, Heisenberg, Jesse, Marshall + Lily]
Group 5: Phoebe(host) | [Tim, Phillip, Addy, Fina]

Week 16:
Group 0: Joey(host) | [Elly, Reiner, Bertholdt, Annie, Kurt]
Group 1: Rachel(host) | [Cody + Anna, Jennie, Mark]
Group 2: Monica(host) | [Chris, Eric + Michelle, Henry, Addy]
Group 3: Sam + Andy(host) | [Tyler, Andrew, Marshall + Lily]
Group 4: Phoebe(host) | [Kyle, Jesse, Robin, Heisenberg]
Group 5: Ted(host) | [Tim, Chandler, Barney, Phillip, Fina]

Week 17:
Group 0: Monica(host) | [Elly, Reiner, Bertholdt, Annie, Kurt]
Group 1: Phoebe(host) | [Cody + Anna, Jennie, Mark]
Group 2: Joey(host) | [Chris, Marshall + Lily, Barney, Phillip]
Group 3: Rachel(host) | [Eric + Michelle, Henry, Tyler]
Group 4: Ted(host) | [Andrew, Kyle, Sam + Andy, Addy]
Group 5: Robin(host) | [Tim, Chandler, Fina, Heisenberg, Jesse]

Week 18:
Group 0: Rachel(host) | [Elly, Reiner, Bertholdt, Annie, Kurt]
Group 1: Ted(host) | [Cody + Anna, Jennie, Mark, Heisenberg]
Group 2: Phoebe(host) | [Chris, Eric + Michelle, Henry, Addy]
Group 3: Robin(host) | [Tyler, Andrew, Kyle, Joey]
Group 4: Marshall + Lily(host) | [Tim, Sam + Andy, Phillip]
Group 5: Barney(host) | [Chandler, Monica, Fina, Jesse]

Week 19:
Group 0: Phoebe(host) | [Elly, Reiner, Bertholdt, Annie, Monica]
Group 1: Robin(host) | [Cody + Anna, Jennie, Mark, Kurt]
Group 2: Rachel(host) | [Chris, Kyle, Phillip, Fina]
Group 3: Ted(host) | [Eric + Michelle, Henry, Tyler, Jesse]
Group 4: Marshall + Lily(host) | [Andrew, Chandler, Joey, Addy]
Group 5: Barney(host) | [Tim, Sam + Andy, Heisenberg]

Week 20:
Group 0: Ted(host) | [Elly, Reiner, Bertholdt, Annie, Rachel]
Group 1: Marshall + Lily(host) | [Cody + Anna, Jennie, Fina]
Group 2: Robin(host) | [Chris, Eric + Michelle, Henry, Phillip]
Group 3: Barney(host) | [Mark, Kyle, Joey, Addy]
Group 4: Phoebe(host) | [Tyler, Andrew, Heisenberg, Jesse]
Group 5: Kurt(host) | [Tim, Sam + Andy, Chandler, Monica]

Week 21:
Group 0: Robin(host) | [Elly, Reiner, Bertholdt, Annie, Phoebe]
Group 1: Barney(host) | [Cody + Anna, Jennie, Tyler]
Group 2: Ted(host) | [Chris, Addy, Fina, Jesse]
Group 3: Marshall + Lily(host) | [Eric + Michelle, Henry, Heisenberg]
Group 4: Kurt(host) | [Mark, Andrew, Kyle, Joey, Rachel]
Group 5: Phillip(host) | [Tim, Sam + Andy, Chandler, Monica]

Week 22:
Group 0: Marshall + Lily(host) | [Elly, Reiner, Bertholdt, Jesse]
Group 1: Barney(host) | [Annie, Chris, Eric + Michelle, Ted]
Group 2: Kurt(host) | [Cody + Anna, Henry, Jennie]
Group 3: Phillip(host) | [Mark, Tyler, Andrew, Kyle, Rachel]
Group 4: Addy(host) | [Tim, Chandler, Joey, Monica, Phoebe]
Group 5: Robin(host) | [Sam + Andy, Fina, Heisenberg]

Week 23:
Group 0: Barney(host) | [Elly, Reiner, Bertholdt, Henry, Robin]
Group 1: Marshall + Lily(host) | [Annie, Chris, Mark, Heisenberg]
Group 2: Phillip(host) | [Cody + Anna, Jennie, Joey]
Group 3: Kurt(host) | [Eric + Michelle, Tyler, Jesse]
Group 4: Addy(host) | [Andrew, Kyle, Sam + Andy, Ted]
Group 5: Fina(host) | [Tim, Chandler, Monica, Rachel, Phoebe]

Week 24:
Group 0: Kurt(host) | [Elly, Reiner, Bertholdt, Annie, Monica]
Group 1: Addy(host) | [Cody + Anna, Jennie, Mark, Rachel]
Group 2: Phillip(host) | [Chris, Eric + Michelle, Henry, Phoebe]
Group 3: Marshall + Lily(host) | [Tyler, Kyle, Ted]
Group 4: Barney(host) | [Andrew, Robin, Fina, Jesse]
Group 5: Heisenberg(host) | [Tim, Sam + Andy, Chandler, Joey]

Week 25:
Group 0: Phillip(host) | [Elly, Reiner, Bertholdt, Annie]
Group 1: Fina(host) | [Cody + Anna, Jennie, Mark, Joey]
Group 2: Kurt(host) | [Chris, Marshall + Lily, Barney]
Group 3: Addy(host) | [Eric + Michelle, Henry, Tyler, Robin]
Group 4: Heisenberg(host) | [Andrew, Kyle, Monica, Rachel, Phoebe]
Group 5: Jesse(host) | [Tim, Sam + Andy, Chandler, Ted]

Week 26:
Group 0: Addy(host) | [Elly, Reiner, Bertholdt, Annie]
Group 1: Heisenberg(host) | [Cody + Anna, Jennie, Mark, Robin]
Group 2: Fina(host) | [Chris, Eric + Michelle, Henry, Ted]
Group 3: Jesse(host) | [Tyler, Andrew, Kyle, Joey, Phoebe]
Group 4: Tim(host) | [Chandler, Kurt, Phillip, Marshall + Lily]
Group 5: Sam + Andy(host) | [Monica, Rachel, Barney]

Week 27:
Group 0: Fina(host) | [Elly, Reiner, Bertholdt, Annie, Andrew]
Group 1: Jesse(host) | [Cody + Anna, Jennie, Mark, Monica]
Group 2: Addy(host) | [Chris, Phillip, Sam + Andy, Chandler]
Group 3: Heisenberg(host) | [Eric + Michelle, Henry, Tyler, Ted]
Group 4: Kyle(host) | [Tim, Barney, Kurt, Robin]
Group 5: Joey(host) | [Rachel, Phoebe, Marshall + Lily]

Week 28:
Group 0: Heisenberg(host) | [Elly, Reiner, Bertholdt, Annie, Barney]
Group 1: Cody + Anna(host) | [Chris, Henry, Jennie, Mark]
Group 2: Jesse(host) | [Eric + Michelle, Rachel, Marshall + Lily]
Group 3: Fina(host) | [Tyler, Kyle, Robin, Phillip]
Group 4: Andrew(host) | [Tim, Sam + Andy, Chandler, Monica]
Group 5: Joey(host) | [Phoebe, Ted, Kurt, Addy]

Week 29:
Group 0: Jesse(host) | [Elly, Reiner, Bertholdt, Annie, Henry]
Group 1: Heisenberg(host) | [Chris, Marshall + Lily, Kurt]
Group 2: Eric + Michelle(host) | [Mark, Tim, Chandler, Monica]
Group 3: Cody + Anna(host) | [Tyler, Andrew, Kyle, Joey]
Group 4: Fina(host) | [Sam + Andy, Addy, Phillip]
Group 5: Jennie(host) | [Rachel, Phoebe, Ted, Robin, Barney]

Week 30:
Group 0: Elly(host) | [Reiner, Bertholdt, Annie, Cody + Anna]
Group 1: Jesse(host) | [Chris, Robin, Kurt, Phillip]
Group 2: Henry(host) | [Jennie, Tim, Sam + Andy, Chandler]
Group 3: Eric + Michelle(host) | [Tyler, Andrew, Kyle, Ted]
Group 4: Mark(host) | [Joey, Monica, Rachel, Phoebe, Addy]
Group 5: Marshall + Lily(host) | [Barney, Fina, Heisenberg]

Week 31:
Group 0: Reiner(host) | [Cody + Anna, Jennie, Mark, Rachel]
Group 1: Elly(host) | [Chris, Eric + Michelle, Henry, Monica]
Group 2: Bertholdt(host) | [Tyler, Andrew, Kyle, Tim, Phoebe]
Group 3: Annie(host) | [Sam + Andy, Chandler, Joey, Ted]
Group 4: Robin(host) | [Marshall + Lily, Kurt, Phillip]
Group 5: Jesse(host) | [Barney, Addy, Fina, Heisenberg]

Week 32:
Group 0: Bertholdt(host) | [Cody + Anna, Henry, Sam + Andy]
Group 1: Reiner(host) | [Chris, Eric + Michelle, Kyle, Joey]
Group 2: Elly(host) | [Jennie, Mark, Tyler, Andrew, Chandler]
Group 3: Annie(host) | [Tim, Monica, Rachel, Phoebe, Robin]
Group 4: Heisenberg(host) | [Phillip, Addy, Fina, Jesse]
Group 5: Ted(host) | [Marshall + Lily, Barney, Kurt]

Week 33:
Group 0: Annie(host) | [Cody + Anna, Henry, Marshall + Lily]
Group 1: Bertholdt(host) | [Eric + Michelle, Jennie, Mark, Kurt]
Group 2: Reiner(host) | [Tyler, Andrew, Chandler, Monica, Barney]
Group 3: Elly(host) | [Kyle, Tim, Sam + Andy, Robin]
Group 4: Chris(host) | [Joey, Rachel, Phoebe, Ted]
Group 5: Addy(host) | [Fina, Heisenberg, Jesse, Phillip]

Week 34:
Group 0: Annie(host) | [Eric + Michelle, Jennie, Mark, Tyler]
Group 1: Chris(host) | [Kyle, Phillip, Addy, Henry, Andrew]
Group 2: Reiner(host) | [Tim, Sam + Andy, Robin, Jesse]
Group 3: Bertholdt(host) | [Chandler, Monica, Marshall + Lily]
Group 4: Elly(host) | [Joey, Rachel, Phoebe, Ted, Heisenberg]
Group 5: Cody + Anna(host) | [Barney, Kurt, Fina]

Week 35:
Group 0: Chris(host) | [Jennie, Chandler, Monica, Eric + Michelle]
Group 1: Annie(host) | [Andrew, Kyle, Jesse, Henry, Mark]
Group 2: Cody + Anna(host) | [Tim, Sam + Andy, Tyler]
Group 3: Bertholdt(host) | [Joey, Rachel, Robin, Heisenberg]
Group 4: Reiner(host) | [Phoebe, Ted, Phillip, Fina]
Group 5: Elly(host) | [Marshall + Lily, Barney, Kurt, Addy]

Week 36:
Group 0: Henry(host) | [Kyle, Elly, Annie, Jennie, Mark]
Group 1: Chris(host) | [Tim, Sam + Andy, Robin, Tyler]
Group 2: Cody + Anna(host) | [Chandler, Monica, Rachel, Andrew]
Group 3: Eric + Michelle(host) | [Joey, Phoebe, Addy]
Group 4: Bertholdt(host) | [Ted, Barney, Phillip, Fina, Jesse]
Group 5: Reiner(host) | [Marshall + Lily, Kurt, Heisenberg]

Week 37:
Group 0: Eric + Michelle(host) | [Sam + Andy, Rachel, Reiner]
Group 1: Henry(host) | [Joey, Monica, Addy, Bertholdt, Jennie]
Group 2: Cody + Anna(host) | [Phoebe, Ted, Robin, Mark]
Group 3: Chris(host) | [Marshall + Lily, Tyler, Andrew, Kyle]
Group 4: Annie(host) | [Barney, Kurt, Heisenberg, Tim]
Group 5: Elly(host) | [Phillip, Fina, Jesse, Chandler]

Week 38:
Group 0: Mark(host) | [Sam + Andy, Elly, Reiner, Bertholdt]
Group 1: Henry(host) | [Rachel, Phoebe, Ted, Jennie, Tyler]
Group 2: Eric + Michelle(host) | [Robin, Jesse, Andrew, Kyle]
Group 3: Cody + Anna(host) | [Marshall + Lily, Heisenberg, Tim]
Group 4: Chris(host) | [Barney, Kurt, Chandler, Joey]
Group 5: Annie(host) | [Phillip, Fina, Monica, Addy]

Week 39:
Group 0: Tyler(host) | [Rachel, Phoebe, Addy, Fina, Elly]
Group 1: Mark(host) | [Ted, Reiner, Bertholdt, Annie, Chris]
Group 2: Henry(host) | [Robin, Barney, Kurt, Heisenberg, Jennie]
Group 3: Eric + Michelle(host) | [Marshall + Lily, Phillip, Andrew]
Group 4: Cody + Anna(host) | [Jesse, Kyle, Tim]
Group 5: Sam + Andy(host) | [Chandler, Joey, Monica]

Week 40:
Group 0: Andrew(host) | [Phoebe, Phillip, Fina, Elly, Reiner]
Group 1: Tyler(host) | [Ted, Bertholdt, Annie, Cody + Anna]
Group 2: Mark(host) | [Robin, Barney, Jesse, Chris, Tim]
Group 3: Henry(host) | [Marshall + Lily, Eric + Michelle, Chandler]
Group 4: Jennie(host) | [Kurt, Sam + Andy, Joey]
Group 5: Kyle(host) | [Addy, Monica, Rachel, Heisenberg]

Week 41:
Group 0: Monica(host) | [Phoebe, Fina, Elly, Reiner, Bertholdt]
Group 1: Andrew(host) | [Ted, Annie, Cody + Anna, Chris]
Group 2: Tyler(host) | [Robin, Barney, Eric + Michelle, Henry]
Group 3: Jennie(host) | [Marshall + Lily, Kyle, Tim, Joey]
Group 4: Mark(host) | [Kurt, Sam + Andy, Rachel]
Group 5: Chandler(host) | [Phillip, Addy, Heisenberg, Jesse]

Week 42:
Group 0: Andrew(host) | [Robin, Barney, Elly, Reiner, Bertholdt]
Group 1: Mark(host) | [Marshall + Lily, Annie, Cody + Anna]
Group 2: Tyler(host) | [Kurt, Chris, Eric + Michelle, Henry]
Group 3: Monica(host) | [Phillip, Jennie, Tim, Chandler, Joey]
Group 4: Sam + Andy(host) | [Addy, Heisenberg, Rachel]
Group 5: Kyle(host) | [Fina, Phoebe, Ted, Jesse]

Week 43:
Group 0: Tyler(host) | [Marshall + Lily, Elly, Reiner, Bertholdt]
Group 1: Andrew(host) | [Kurt, Annie, Cody + Anna, Chris]
Group 2: Sam + Andy(host) | [Fina, Henry, Jennie, Mark]
Group 3: Eric + Michelle(host) | [Heisenberg, Kyle, Tim, Chandler]
Group 4: Joey(host) | [Monica, Rachel, Phoebe, Ted]
Group 5: Robin(host) | [Barney, Phillip, Addy, Jesse]

Week 44:
Group 0: Andrew(host) | [Marshall + Lily, Elly, Reiner, Bertholdt]
Group 1: Joey(host) | [Heisenberg, Annie, Cody + Anna, Chris]
Group 2: Fina(host) | [Jesse, Eric + Michelle, Henry, Jennie]
Group 3: Mark(host) | [Tyler, Kyle, Tim, Sam + Andy]
Group 4: Chandler(host) | [Monica, Rachel, Phoebe, Ted]
Group 5: Robin(host) | [Barney, Kurt, Phillip, Addy]

Week 45:
Group 0: Chandler(host) | [Marshall + Lily, Elly, Reiner, Bertholdt]
Group 1: Fina(host) | [Heisenberg, Annie, Cody + Anna, Chris]
Group 2: Eric + Michelle(host) | [Henry, Jennie, Mark, Tyler]
Group 3: Andrew(host) | [Kyle, Tim, Sam + Andy, Joey]
Group 4: Monica(host) | [Rachel, Phoebe, Ted, Robin]
Group 5: Barney(host) | [Kurt, Phillip, Addy, Jesse]

Week 46:
Group 0: Monica(host) | [Marshall + Lily, Elly, Reiner, Bertholdt]
Group 1: Annie(host) | [Cody + Anna, Chris, Eric + Michelle]
Group 2: Henry(host) | [Jennie, Mark, Tyler, Andrew, Kyle]
Group 3: Tim(host) | [Sam + Andy, Chandler, Joey, Rachel]
Group 4: Phoebe(host) | [Ted, Robin, Barney, Kurt]
Group 5: Phillip(host) | [Addy, Fina, Heisenberg, Jesse]

