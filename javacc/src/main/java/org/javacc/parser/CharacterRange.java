/* Copyright (c) 2006, Sun Microsystems, Inc.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *     * Redistributions of source code must retain the above copyright notice,
 *       this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of the Sun Microsystems, Inc. nor the names of its
 *       contributors may be used to endorse or promote products derived from
 *       this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF
 * THE POSSIBILITY OF SUCH DAMAGE.
 */

package org.javacc.parser;

/** Describes character range descriptors in a character list. */
public final class CharacterRange extends CharacterDescriptor {
  /**
   * The line and column number of the construct that corresponds
   * most closely to this node.
   */
  private int line, column;
  /** The leftmost and the rightmost characters in this character range. */
  private char left, right;

  CharacterRange() {}

  CharacterRange(char l, char r) {
    if (l > r) {
      JavaCCErrors.semanticError(this, "Invalid range : \"" + (int) l + "\" - \""
          + (int) r + "\". First character shoud be less than or equal to the second one in a range.");
    }

    setLeft(l);
    setRight(r);
  }

  void setLine(int line) {
    this.line = line;
  }

  int getLine() {
    return line;
  }

  void setColumn(int column) {
    this.column = column;
  }

  int getColumn() {
    return column;
  }

  public void setLeft(char left) {
    this.left = left;
  }

  public char getLeft() {
    return left;
  }

  public void setRight(char right) {
    this.right = right;
  }

  public char getRight() {
    return right;
  }
}
