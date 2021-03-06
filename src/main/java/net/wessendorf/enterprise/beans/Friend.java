/*
 * Copyright (C) 2011 Matthias Weßendorf.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.wessendorf.enterprise.beans;

import javax.persistence.Basic;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("'F'")
public class Friend extends Person
{
  private static final long serialVersionUID = 1L;

  @Basic
  private String nickname;

  public String getNickname()
  {
    return nickname;
  }

  public void setNickname(String nickname)
  {
    this.nickname = nickname;
  }
}
