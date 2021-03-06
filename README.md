# Labfolder assignment solution

## Scope

As per the guidelines, I've written the solution assuming it will be going into the production code.

I've ensured to keep the code high-quality, readable and loosely coupled. Mentioned below are the highlights of the solution.

### Backend

- [x] Employed the MVC pattern to structure the backend solution.
- [x] Added proper Javadoc for every class and interface.
- [x] Wrote the Levenshtien distance algorithm, rather than copy-pasting from the internet.
- [x] Have added JUnit test-cases for the service class (as most business logic is present there) using JUnit5 and Mockito.

### Frontend

- [x] Made a simple (not yet functional) frontend in ReactJS to carry-out the operations from the UI.
- [x] Followed UI/UX convention from the book 'Refactoring UI'.
- [x] Used Blue/Red Accent colors from the LabForward website.

## Further Improvements (If I had more time)

> I've utilised all the 8 hours assigned on this project. Mentioned below are my further improvements if more time was spent.

- [ ] Add support for multiple notebooks, and query corresponding data based on Notebook ID.
- [ ] Currently, the Levenshtien distance check is employed on all the words and if it's less than 1 that word is marked as a similar. This exhausively checks every word, which can be made better using BK-tree based solution.
- [ ] Improve the performance of frequency by employing some cache.
- [ ] Improve the performance of the recusive Levenshtien algorithm by using memoization.
- [ ] Add API documentation using Swagger API.
- [ ] Make the React UI fully functional.
- [ ] UI: Better component delimition (currently everything is crammed into a single BaseCard.jsx component).

## Screenshot(s) of UI

### Idle Screen

![alt text](https://github.com/Swapnil-ingle/labFolder_Project/blob/main/Img/labfolder-project-ui-idle.png "Screenshot: Idle Screen")

### Similar

![alt text](https://github.com/Swapnil-ingle/labFolder_Project/blob/main/Img/labfolder-project-ui-similar.png "Screenshot: Frequency Check Screen")

### Frequency

![alt text](https://github.com/Swapnil-ingle/labFolder_Project/blob/main/Img/labfolder-project-ui-frequency.png "Screenshot: Frequency Check Screen")
