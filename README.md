
===

# BYND Library

## Table of Contents
1. [Overview](#Overview)
1. [Product Spec](#Product-Spec)
1. [Wireframes](#Wireframes)
2. [Schema](#Schema)

## Overview
### Description
A person will be able to compose a review and short description of the book. People will be able to see the cover of the book and will be able to add comments.

### App Evaluation
[Evaluation of your app across the following attributes]
- **Category:** Entertainment
- **Mobile:** Yes
- **Story:** 
- **Market:** Android users
- **Habit:** It's like a drug; use it once and you'll never get enough.
- **Scope:** Everyone who can read and is interested in books and has an android.

## Product Spec

### 1. User Stories (Required and Optional)

**Required Must-have Stories**

* Login
* Book review
* Book description
* Book cover
* Book rating

**Optional Nice-to-have Stories**

* Movie option if the book has a corresponding movie

### 2. Screen Archetypes

* Login screen
   * Login
* Books list page
   * list of books
   * title, author, book cover photo
* Specific book information
    * book rating, description, title, author, reviews list

### 3. Navigation

**Tab Navigation** (Tab to Screen)

* [fill out your first tab]
* [fill out your second tab]
* [fill out your third tab]

**Flow Navigation** (Screen to Screen)

* Login screen
   * once logged in you go to the homepage
   * ...
* Homepage
   * list of books and titles
   * ...
* Individual book
    * Info about a specific book

## Wireframes

<img src='app_tree.jpg' width='500' />


### [BONUS] Digital Wireframes & Mockups

### [BONUS] Interactive Prototype

# Schemas
---


### Models
| Property    | Type   | Description                           |
| ----------- | ------ | ------------------------------------- |
| Author      | String | Author of the book                    |
| Image       | File   | Image of the cover of the book        |
| Reviews     | String | Person's opinion of the book          |
| Rating      | Button | Person's rating of the book 1-10      |
| Title       | String | Title of the book                     |
| Description | String | Description of the book               |
| Username    | String | Pointer to a person who left a review |
| password    | String | Password for the persons username     |
| Login       | Button | Button to enter the username and pword|
|             |        |                                       |
|             |        |                                       |
|             |        |                                       |

# Networking

- ### Login Screen
    - (Read/GET) a place to enter username and password
- ### Home Feed Screen
    - (Read/GET) shows books, titles, and authors in a recycler view
- ### Book Screen
    - (Read/GET) shows a specific book and it's description
    - (Create/POST) can create and post a review about a book
    - (Create/POST) can give a rating to the book
- ### User Profile Screen
    - (Read/GET) profile picture and any of the reviews you made
    - (Update/PUT) updates the user profile image



