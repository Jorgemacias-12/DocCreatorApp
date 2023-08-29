export class User {
  public ID?: number;
  public FullName: string;
  public Email: string;
  public Preferences: string[];

  constructor(fullName: string, email: string, preferences: string[]) {
    this.FullName = fullName;
    this.Email = email;
    this.Preferences = preferences;
  }
}