# java-bookstore

# Introduction

This is a bookstore with books who have authors and can be found in a section of the store.

# Instructions

Create a REST API server to store and read data from a MySQL Database. The table layouts should be

* book
  * bookid - long primary key
  * booktitle - String the title of the book
  * ISBN - String the ISBN number of the book
  * copy - Int the year the book was published (copyright date)
  * sectionid - foreign key to the section where the book can be found.
  
* authors
  * authorid - long primary key
  * lname - String last name of the author
  * fname - String first name of the author

There is a many to many relationship between authors and books. A book may have many authors while an author may write many books.

* section
  * section - long primary key
  * name - name String the section in the store where the book may be found. For example: Sci Fi, Romance, Western, Mystery, Finance

There is a one to many relationship between the book and the section. A section can have many books while a book can only be in one section.

* data.sql contains sample data to test your application

* End points should return the data worked with or nothing if no data is found.
* Swagger should be used to document your API. Unless noted below, the default documentation is sufficient assuming appropriate names are used in your coding. For custom Swagger documentation, you do NOT need to document error messages.

* List the data

  * GET /books - returns a JSON object list of all the books, their authors, and their section where the book is located. This end point requires custom Swagger documentation.
  
  * GET /authors - returns a JSON object list of all the authors, their books, and the section where the books is located. This end point requires custom Swagger documentation.

  * GET /sections - returns a JSON object list of all the sections, their books, and the books authors. This end point requires custom Swagger documentation.
  
* Manage the data
  * PUT /books/{id} - updates a books info (Title, Copyright, ISBN)
  * POST /books/authors{id} - assigns a book already in the system to an author already in the system
  * DELETE /books/{id} - deletes a book.
 
Your system will have authentication in place. The following are the roles you need to handle:
* User - people who can look up books, authors, sections,
* Data - people who can update data on books, authors, sections. The can also read books, authors, sections.
* MGR - people who can update data on users but not on books, authors, sections. They can read books, authors, sections.

Expose the following end points to aid in managing users

* GET /users - returns a JSON object list of all users

* DELETE /user - deletes a users

* POST /user - adds a User


Expose at least the following actuator endpoints to help with system management
* /health
* /info
* /metrics

Note that several obvious end points are not included in the required list. Finishing out the list of useful end points is the stretch goal. You are to decide what those end points are!
