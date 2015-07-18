/**
 * Contains some examples about Documentation topic.
 *
 * <h2>The javadoc Tags:</h2>
 * <p>
 * The javadoc tool recognizes the following tags:
 * </p>
 * <head> <link rel="stylesheet" type="text/css" href="../../../../files/mystyle.css"></head>
 * <table>
 * <tbody>
 * <tr>
 * <th>Tag</th>
 * <th>Description</th>
 * <th>Syntax</th>
 * </tr>
 * <tr>
 * <td>@author</td>
 * <td>Adds the author of a class.</td>
 * <td>@author name-text</td>
 * </tr>
 * <tr>
 * <td>{@code}</td>
 * <td>Displays text in code font without interpreting the text as HTML markup or nested javadoc
 * tags.</td>
 * <td>{@code  text}</td>
 * </tr>
 * <tr>
 * <td>{@docRoot}</td>
 * <td>Represents the relative path to the generated document's root directory from any generated
 * page</td>
 * <td>{@docRoot}</td>
 * </tr>
 * <tr>
 * <td>@deprecated</td>
 * <td>Adds a comment indicating that this API should no longer be used.</td>
 * <td>@deprecated deprecated-text</td>
 * </tr>
 * <tr>
 * <td>@exception</td>
 * <td>Adds a <b>Throws</b> subheading to the generated documentation, with the class-name and
 * description text.</td>
 * <td>@exception class-name description</td>
 * </tr>
 * <tr>
 * <td>{@inheritDoc}</td>
 * <td>Inherits a comment from the <b>nearest</b> inheritable class or implementable interface</td>
 * <td>Inherits a comment from the immediate surperclass.</td>
 * </tr>
 * <tr>
 * <td>{@link}</td>
 * <td>Inserts an in-line link with visible text label that points to the documentation for the
 * specified package, class or member name of a referenced class. T</td>
 * <td>{@link package.class#member label}</td>
 * </tr>
 * <tr>
 * <td>{@linkplain}</td>
 * <td>Identical to {@link}, except the link's label is displayed in plain text than code font.</td>
 * <td>{@linkplain package.class#member label}</td>
 * </tr>
 * <tr>
 * <td>@param</td>
 * <td>Adds a parameter with the specified parameter-name followed by the specified description to
 * the "Parameters" section.</td>
 * <td>@param parameter-name description</td>
 * </tr>
 * <tr>
 * <td>@return</td>
 * <td>Adds a "Returns" section with the description text.</td>
 * <td>@return description</td>
 * </tr>
 * <tr>
 * <td>@see</td>
 * <td>Adds a "See Also" heading with a link or text entry that points to reference.</td>
 * <td>@see reference</td>
 * </tr>
 * <tr>
 * <td>@serial</td>
 * <td>Used in the doc comment for a default serializable field.</td>
 * <td>@serial field-description | include | exclude</td>
 * </tr>
 * <tr>
 * <td>@serialData</td>
 * <td>Documents the data written by the writeObject( ) or writeExternal( ) methods</td>
 * <td>@serialData data-description</td>
 * </tr>
 * <tr>
 * <td>@serialField</td>
 * <td>Documents an ObjectStreamField component.</td>
 * <td>@serialField field-name field-type field-description</td>
 * </tr>
 * <tr>
 * <td>@since</td>
 * <td>Adds a "Since" heading with the specified since-text to the generated documentation.</td>
 * <td>@since release</td>
 * </tr>
 * <tr>
 * <td>@throws</td>
 * <td>The @throws and @exception tags are synonyms.</td>
 * <td>@throws class-name description</td>
 * </tr>
 * <tr>
 * <td>{@value}</td>
 * <td>When {@value} is used in the doc comment of a static field, it displays the value of that
 * constant:</td>
 * <td>package.class#field}</td>
 * </tr>
 * <tr>
 * <td>@version</td>
 * <td>Adds a "Version" subheading with the specified version-text to the generated docs when the
 * -version option is used.</td>
 * <td>@version version-text</td>
 * </tr>
 * </tbody>
 * </table>
 */
package com.tutorialspoint.documentation;