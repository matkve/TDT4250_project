# TDT4250_project
Football world cup ecore model with external data source and sirius DSL. I did this project alone, so I had to make some compromises in what features to add.
# Instructions
Clone the repository into eclipse. I have created an ecore model (tdt4250.football.model/model/footballWorldCups.ecore) representing soccer world cups based on an external data source (that can be found here https://worldcup.sfg.io/). In order to create model instances from this JSON data I have created a M2M transformation (json to wc model) in java, and the code for this can be found here "tdt4250.football.model/src/JSON/WorldCupJson.java". You need to run the file "tdt4250.football.model/src/JSON/getWorldCupData.java", because this code will perform an M2M transformation through an instance of the WorldCupJson class, and a wc model file will be created here; "tdt4250.football.model/model/worldCup.wc". It is important that you move this generated wc file into a new version of eclipse when you get that far: The other eclipse version needs to include the diagram, model, edit and editor plug-ins in the run configurations. Now, in the new eclipse version you need to create a new Sirius Modeling Project, open the "representations.aird" file, add the "worldCup.wc" model, enable the WcDiagramViewpoint, and create a new UniverseDiagram. You can double click list elements to navigate to world cup diagrams, and this type of navigation is used a lot in other diagrams as well. I have tried to add tooltips where possible for explaining possible actions if you hover over certain objects. I assume that you press "Arrange All" to clean up the diagrams.
# What to look for
- Large M2M transformation which I found very difficult to figure out how to do, because of lacking documentation. (I ended up looking through the generated model code from the genmodel to figure it out.)
- Lots of edit and creation tools.
- Selection wizards for assigning roles to players within matches.
- Can create new matches and stage one groups (with code for automatically assigning group number).
- The edges between world cup matches of different stages are not modelled in the ecore model, but were determined from acceleo code.
- A filter in wcDiagram to hide third place playoff match.
- There's a lot more to check out, but here I just listed what can maybe be difficult to find.
# Limitations
- The public data source had a lot of really good data per world cup, but unfortunately I could only find two different world cups. Both of these are combined into a single model in the M2M transformation code.
- No model constraints, because I decided it was not worth it when working alone, and I have already shown that I know how it works in the previous assignment.
- No tests.
