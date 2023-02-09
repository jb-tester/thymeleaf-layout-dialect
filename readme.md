## Thymeleaf Layout Dialect test

**1. Decorate:**
  - no usages are found for the layout fragments
  - no navigation to the layout fragments from the usages in the pages that use this layout (see decorator/test1.html, (see decorator/test2.html) )
  - layout:decorate: we don't validate the tag:
       - no errors for not found template 
       - no errors for the case when the attribute is placed not in the root element (see decorator/test2_incorrect.html)
  - layout parameters using:
       - parsing errors are displayed for the layout:decorate with parameters (see decorator/test3.html)
       - no references are provided for parameter names 
       - the thymeleaf expressions used as parameter values are not supported (see decorator/test3.html)
**2. Title Pattern:**
  - parsing error in the $LAYOUT_TITLE and $CONTENT_TITLE tokens (see decorator/test1.html)
**3. Fragment:**
  - parameters are not resolved in the fragment definition (see insert/layout_to_insert.html)
**4. Insert, Replace:**
  - parsing errors in the parameterized template inserting/replacing expression (see insert/test2.html)
  - no completion/reference to fragment in insert expression (see insert/test1.html)